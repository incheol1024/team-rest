package team.study.rest.city.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.dto.CityCovidDTO;
import team.study.rest.city.dto.CityCovidResponse;

import java.util.List;

// 공통으로 쓰일 수 있는 부분이라
// 특정 Object로 변환하지 않도록 설계할 수 있나???
public class XMLParseHandler implements ParseHandler{

    private Object object;

    public XMLParseHandler() {
    }

    // parse 과정에서 CityCovidDTO는 변하는 부분임
    // return 값 또한 변해야함.
    @Override
    public List<?> parse(RestTemplate restTemplate, String uri) {
        object = restTemplate.getForObject(uri, CityCovidDTO.class);
        //return this.object.getCityStatus();
        return null;
    }
}
