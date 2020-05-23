package team.study.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

@Component
@Slf4j
public final class ApiRequestUtil {


    private static RestTemplate restTemplate;

    @Autowired
    private ApiRequestUtil(RestTemplate restTemplate) {
        ApiRequestUtil.restTemplate = restTemplate;
    }


    public static <T> T sendRequestByPost(URI uri, Map<String, ?> body, Class<T> returnType) {
        return restTemplate.postForEntity(uri, body, returnType).getBody();
    }

    public static <T> T sendRequestByMultipart(URI uri, MultiValueMap<String, Object> body, Class<T> returnType) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        httpHeaders.set("Authorization", "KakaoAK b83d6b24bfbd985bd873b8988bfba8d3");


        MultipartBodyBuilder multipartBodyBuilder = new MultipartBodyBuilder();
        multipartBodyBuilder.part("file", "baba".getBytes());
        MultiValueMap<String, HttpEntity<?>> build = multipartBodyBuilder.build();


        HttpEntity<MultiValueMap<String, HttpEntity<?>>> httpEntity = new HttpEntity<>(build, httpHeaders);

        restTemplate.exchange(uri, HttpMethod.POST, httpEntity, String.class);

        return restTemplate.postForEntity(uri, httpEntity, returnType).getBody();
    }

    private static <T> RequestEntity<T> getRequestEntity(Class<T> bodyType) {
        return null;
    }

}
