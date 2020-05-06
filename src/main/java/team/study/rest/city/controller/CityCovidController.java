package team.study.rest.city.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.city.dto.CityCovidRequest;
import team.study.rest.city.dto.CityCovidResponse;
import team.study.rest.city.service.CityCovidService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/city")
public class CityCovidController {

    @Autowired
    private CityCovidService cityCovidService;

    @PostMapping("/save")
    public int createCityStatus(CityCovidRequest request) {
        return  1;
    }

    // 시도별 코로나 현황 목록 조회
    // Get Method로 Http 요청
    @GetMapping("/list")
    public List<CityCovidResponse> getCityStatus() {
        return this.cityCovidService.getCityStatus();
    }
}
