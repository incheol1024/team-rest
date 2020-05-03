package team.study.rest.city.common;

import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface ParseHandler {
    List<?> parse(RestTemplate restTemplate, String uri);
}
