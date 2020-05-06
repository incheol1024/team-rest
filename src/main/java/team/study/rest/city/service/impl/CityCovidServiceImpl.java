package team.study.rest.city.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.common.APIHandler;
import team.study.rest.city.common.XMLParseHandler;
import team.study.rest.city.common.ParseHandler;
import team.study.rest.city.dto.CityCovidDTO;
import team.study.rest.city.dto.CityCovidResponse;
import team.study.rest.city.handler.CityAPIHandler;
import team.study.rest.city.service.CityCovidService;

import java.util.List;

@Slf4j
@Service
public class CityCovidServiceImpl implements CityCovidService {

    // api handler
    private APIHandler apiHandler;
    // parse handler
    private ParseHandler parseHandler;
    private Logger logger;

    public CityCovidServiceImpl() {
        this.apiHandler = new CityAPIHandler();
        this.parseHandler = new XMLParseHandler(new RestTemplate(), new CityCovidDTO());
        this.logger = LoggerFactory.getLogger(CityCovidServiceImpl.class);
    }

    // 시도별 코로나 현황
    @Override
    public List<CityCovidResponse> getCityStatus() {
        logger.info("Log : {}",this.apiHandler.requestData());
        return (List<CityCovidResponse>) this.parseHandler.parse(this.apiHandler.requestData());
    }

    @Override
    public int saveCityStatus() {
        return 0;
    }
}
