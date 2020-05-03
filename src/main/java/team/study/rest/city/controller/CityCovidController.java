package team.study.rest.city.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.city.dto.CityCovidRequest;
import team.study.rest.city.dto.CityCovidResponse;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/city")
public class CityCovidController {

    @PostMapping("/save")
    public int createCityStatus(CityCovidRequest request) {
        return  1;
    }

    @GetMapping("/list")
    public List<CityCovidResponse> getCityStatus(CityCovidRequest request) {
        return  null;
    }
}
