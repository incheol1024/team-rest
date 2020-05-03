package team.study.rest.city.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.common.APIHandler;
import team.study.rest.city.common.JSONParseHandler;
import team.study.rest.city.common.ParseHandler;
import team.study.rest.city.dto.CityCovidResponse;
import team.study.rest.city.handler.CityAPIHandler;
import team.study.rest.city.service.CityCovidService;

import java.util.List;

@Service
public class CityCovidServiceImpl implements CityCovidService {

    // api handler
    private APIHandler apiHandler;
    // parse handler
    private ParseHandler parseHandler;

    @Autowired
    RestTemplate restTemplate;

    public CityCovidServiceImpl(CityAPIHandler cityAPIHandler, JSONParseHandler parseHandler) {
        this.apiHandler = cityAPIHandler;
        this.parseHandler = parseHandler;
    }

    // 시도별 코로나 현황
    @Override
    public List<CityCovidResponse> getCityStatus() {
        return (List<CityCovidResponse>) parseHandler.parse(restTemplate, apiHandler.requestData());
    }

    @Override
    public int saveCityStatus() {
        return 0;
    }
}
