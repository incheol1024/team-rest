package team.study.rest.city.common;

import org.springframework.web.client.RestTemplate;
import team.study.rest.sample.dto.CovidResponseDto;

public class JSONParseHandler implements ParseHandler{

    @Override
    public Object parse(RestTemplate restTemplate, String uri) {
        return restTemplate.getForObject(uri, CovidResponseDto.class);
    }
}
