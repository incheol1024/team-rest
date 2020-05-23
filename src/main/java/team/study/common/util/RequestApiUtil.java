package team.study.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

@Component
@Slf4j
public final class RequestApiUtil {


    private static RestTemplate restTemplate;

    @Autowired
    private RequestApiUtil(RestTemplate restTemplate) {
        RequestApiUtil.restTemplate = restTemplate;
    }


    public static <T> T sendRequestByPost(URI uri, Map<String, ?> body, Class<T> returnType) {
        return null;
//        restTemplate.exchange();
    }


    private static <T> RequestEntity<T> getRequestEntity(Class<T> bodyType) {
        return null;
    }

}
