package team.study.rest.sample.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
public class CovidServiceImpl implements CovidService{
    private final String INTERNAL_PATIENT_COUNT = "https://api.dropper.tech/covid19/status/korea";
    private final String API_KEY = "e555afa30c86ef0e869e9a0e62425f5ebdf4d3a82c8f40cedc18643b206ab553";


    // 국내 환자 수 요청
    @Override
    public String getInternalStatus(String locale) {
        return getInternalCount("seoul");
    }

    public String getInternalCount(String locale) {
        JSONObject result;
        StringBuilder sb = new StringBuilder();
        try {
            URL apiUrl = new URL(INTERNAL_PATIENT_COUNT + "?locale=" + locale);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("APIKey",API_KEY);

            connection.getResponseCode();

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line = "";
            while((line = br.readLine()) != null) {
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
}
