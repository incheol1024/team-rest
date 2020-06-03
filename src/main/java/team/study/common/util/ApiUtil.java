package team.study.common.util;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@Component
public class ApiUtil {

//    @Setter(onMethod_ = {@Autowired})
    private static RestTemplate restTemplate;

    @Autowired
    private ApiUtil(RestTemplate restTemplate) {
        ApiUtil.restTemplate = restTemplate;
    }

    public static <T> T formByPost(String url, HttpEntity request, Class<T> returnType) {
        return restTemplate.postForEntity(url, request, returnType).getBody();
    }
}
