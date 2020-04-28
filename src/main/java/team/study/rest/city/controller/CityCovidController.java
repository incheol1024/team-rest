package team.study.rest.city.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.city.dto.CityCovidRequest;

@Slf4j
@RestController
@RequestMapping("/city")
public class CityCovidController {

    @PostMapping("/insert")
    public int createCityStatus(CityCovidRequest request) {
        return  1;
    }
}
