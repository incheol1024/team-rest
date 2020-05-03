package team.study.rest.city.service;

import team.study.rest.city.dto.CityCovidResponse;

import java.util.List;

public interface CityCovidService {

    // 시도별 코로나현황
    List<CityCovidResponse> getCityStatus();

    // 시도별 코로나 현황 저장
    int saveCityStatus();
}
