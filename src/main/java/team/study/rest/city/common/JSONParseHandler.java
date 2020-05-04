package team.study.rest.city.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.dto.CityCovidDTO;
import team.study.rest.city.dto.CityCovidResponse;

import java.util.List;

public class JSONParseHandler implements ParseHandler{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CityCovidDTO cityCovidDTO;

    public JSONParseHandler() {
        this.cityCovidDTO = new CityCovidDTO();
        this.restTemplate = new RestTemplate();
    }

    @Override
    public List<CityCovidResponse> parse(String uri) {
        cityCovidDTO = restTemplate.getForObject(uri, CityCovidDTO.class);
        return cityCovidDTO.getCityStatus();
    }
}
