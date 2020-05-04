package team.study.rest.city.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.CommonConstants;
import team.study.rest.city.common.APIHandler;
import team.study.rest.city.common.JSONParseHandler;
import team.study.rest.city.common.ParseHandler;
import team.study.rest.city.dto.CityCovidDTO;
import team.study.rest.city.dto.CityCovidResponse;
import team.study.rest.sample.dto.CovidResponseDto;

import java.util.List;

public class CityAPIHandler implements APIHandler {

    // api uri 셋팅
    @Override
    public String requestData() {
        return CommonConstants.END_POINT.concat("/".concat(CommonConstants.SIDO_PARAM))
                                        .concat("?serviceKey=").concat(CommonConstants.KEY)
                                        .concat("&numOfRows=").concat("10")
                                        .concat("&pageNo=").concat("1")
                                        .concat("&startCreateDt=").concat("20200503")
                                        .concat("&endCreateDt=").concat("20200504");
    }
}
