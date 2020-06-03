package team.study.common.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Map;

public class TextUtil {

    public static String whatLanguage(String text) {
        String url = "https://openapi.naver.com/v1/papago/detectLangs";

        HttpHeaders header = new HttpHeaders();
        header.add("X-Naver-Client-Id", "qNTYzpHfkzR6m6_eMOX7");
        header.add("X-Naver-Client-Secret", "Pv_RKubV7J");

        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
        request.add("query", text.length()>100 ? text.substring(0, 100) : text);

        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(request, header);

        return ApiUtil.formByPost(url, httpEntity, Map.class).get("langCode").toString();
    }

    public static String translateIntoKorean(String text) {
        String url = "https://openapi.naver.com/v1/papago/n2mt";

        HttpHeaders header = new HttpHeaders();
        header.add("X-Naver-Client-Id", "qNTYzpHfkzR6m6_eMOX7");
        header.add("X-Naver-Client-Secret", "Pv_RKubV7J");

        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
        request.add("source", whatLanguage(text));
        request.add("target", "ko");
        request.add("text", text);

        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(request, header);

        return ApiUtil.formByPost(url, httpEntity, Map.class).toString();
    }

    public static byte[] textToSpeech(String text) {
        String url = "https://naveropenapi.apigw.ntruss.com/voice/v1/tts";

        HttpHeaders header = new HttpHeaders();
        header.add("X-NCP-APIGW-API-KEY-ID", "z4nr8mvnne");
        header.add("X-NCP-APIGW-API-KEY", "QU69fePdnvTGOpqf5u7NrlHlPU9Mv6XB3ohgWd2C");

        MultiValueMap<String, String> request = new LinkedMultiValueMap<>();
        request.add("speaker", "mijin");
        request.add("text", text);

        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(request, header);

        return ApiUtil.formByPost(url, httpEntity, byte[].class);
    }
}
