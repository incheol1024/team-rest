package team.study.rest.city.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import team.study.rest.city.CommonConstants;
import team.study.rest.city.common.APIHandler;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class CityAPIHandler implements APIHandler {

    private Logger logger;

    @Autowired
    URI requestURI;

    public CityAPIHandler() {
        this.logger = LoggerFactory.getLogger(CityAPIHandler.class);
    }

    // api uri 셋팅
    @Override
    public URI requestData() {
        String key = "";
        try {
            byte[] b = CommonConstants.KEY.getBytes("UTF-8");
            key = new String(b, StandardCharsets.UTF_8);
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new UnsupportedOperationException(); // URI return을 올바르게 하는버
        }

        requestURI = null;
        try {
            // Http 요청 URI 셋팅
            requestURI = new URI(CommonConstants.END_POINT.concat("/".concat(CommonConstants.SIDO_PARAM))
                    .concat("?serviceKey=").concat(CommonConstants.KEY)
                    .concat("&numOfRows=").concat("10")
                    .concat("&pageNo=").concat("1")
                    .concat("&startCreateDt=").concat("20200503")
                    .concat("&endCreateDt=").concat("20200504"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        logger.info("KEY : {},",requestURI);

        return requestURI;
    }
}
