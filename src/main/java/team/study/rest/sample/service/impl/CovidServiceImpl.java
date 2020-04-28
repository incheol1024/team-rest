package team.study.rest.sample.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import team.study.common.constants.CovidConstants;
import team.study.rest.sample.dto.CovidRequestDto;
import team.study.rest.sample.dto.CovidResponseDto;
import team.study.rest.sample.service.CovidService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * 코로나19 API 호출 클래스
 *
 * @author 유형민
 */
@Slf4j
@Service
public class CovidServiceImpl implements CovidService {
    private RestTemplate restTemplate;

    public CovidServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // 국내 환자 수 요청
    @Override
    public String getInternalStatus(String locale) {
        return getInternalCount("seoul");
    }

    public RestTemplate getRestTemplate() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(5000);
        factory.setReadTimeout(5000);

        HttpClient client = HttpClientBuilder.create()
                            .setMaxConnPerRoute(20)
                            .setMaxConnTotal(200)
                            .build();
        factory.setHttpClient(client);
        new RestTemplate(factory);
    }

    @Override
    public CovidResponseDto getResponse() {
        return null;
    }

    public String getInternalCount(String locale) {
        JSONObject result;
        StringBuilder sb = new StringBuilder();
        try {
            URL apiUrl = new URL(CovidConstants.INTERNAL_PATIENT_COUNT + "?locale=" + locale);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestMethod(CovidConstants.GET);
            connection.setRequestProperty(CovidConstants.API_KEY_NAME, CovidConstants.API_KEY);

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public CovidResponseDto convertToJson() {
        return null;
    }
}
