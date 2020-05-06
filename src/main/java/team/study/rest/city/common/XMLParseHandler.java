package team.study.rest.city.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.CommonConstants;
import team.study.rest.city.dto.CityCovidDTO;
import team.study.rest.city.dto.CityCovidResponse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class XMLParseHandler implements ParseHandler{

    // Http Request, Response
    @Autowired
    private RestTemplate restTemplate;
    // XML Binding Model
    private CityCovidDTO cityCovidDTO;
    private Logger log;

    // Parsing 할 때 필요한 객체를 생성자를 통해 의존 받아서 사용
    // 유지보수가 용이하기 위해 객체 생성 시에 Parameter로 주입함
    public XMLParseHandler(RestTemplate restTemplate, CityCovidDTO cityCovidDTO) {
        this.restTemplate = restTemplate;
        this.cityCovidDTO = cityCovidDTO;
        this.log = LoggerFactory.getLogger(XMLParseHandler.class);
    }

    // ParseHandler interface를 상속하여 parse 함수를 재구성하여 사용
    @Override
    public List<CityCovidResponse> parse(URI uri) {
        // Http 요청에 대한 응답이 없어 인코딩 문제로 생각하여 UTF-8로 변환
//        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        // http 요청 후 응답 반환
        cityCovidDTO = restTemplate.getForObject(uri, CityCovidDTO.class);

        // 응답을 했는지 확인하기 위한 임시 log
        log.info("RETURN : {}", cityCovidDTO.getResultCode());

        // Object를 XML Binding 하여 List로 반환
        return cityCovidDTO.getCityStatus();
    }

    // RestTemplate 사용이 안되는 지 확인하기 위한 HttpConnection Test
    public void httpConnectionTest() {
        BufferedReader br = null;

        try {
            String urlstr = CommonConstants.END_POINT.concat("/".concat(CommonConstants.SIDO_PARAM))
                    .concat("?ServiceKey=").concat("")
                    .concat("&numOfRows=").concat("10")
                    .concat("&pageNo=").concat("1")
                    .concat("&startCreateDt=").concat("20200503")
                    .concat("&endCreateDt=").concat("20200504");
            URL url = new URL(urlstr);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestMethod("GET");
            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
            String result = "";
            String line;
            while((line = br.readLine()) != null) {
                result = result + line + "\n";
            }
            System.out.println(result);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
