package team.study.rest.city.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.CommonConstants;
import team.study.rest.city.common.APIHandler;
import team.study.rest.sample.dto.CovidResponseDto;

public class CityAPIHandler implements APIHandler {

    // api uri 셋팅
    @Override
    public String requestData() {
        return CommonConstants.END_POINT.concat(CommonConstants.SIDO_PARAM)
                                        .concat("&serviceKey?").concat(CommonConstants.KEY)
                                        .concat("&numOfRows?").concat("")
                                        .concat("&pageNo?").concat("")
                                        .concat("&startCreateDt?").concat("")
                                        .concat("&endCreateDt?").concat("");
    }
}
