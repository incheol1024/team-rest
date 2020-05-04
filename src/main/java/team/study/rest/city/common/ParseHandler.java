package team.study.rest.city.common;

import org.springframework.web.client.RestTemplate;
import team.study.rest.city.dto.CityCovidResponse;

import java.util.List;

public interface ParseHandler {

    List<CityCovidResponse> parse(String uri);
}