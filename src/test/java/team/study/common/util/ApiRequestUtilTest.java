package team.study.common.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import team.study.rest.vision.dto.ProductDetectionResponseDto;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootTest
class ApiRequestUtilTest {



    @Test
    void sendRequestByPost() throws IOException {

        URI url = URI.create("https://kapi.kakao.com/v1/vision/product/detect");
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap();
        byte[] bytes = Files.readAllBytes(Paths.get("/Users/miyoungkim/Desktop/devImg", "bags.jpg"));
        multiValueMap.add("file", bytes);
        ApiRequestUtil.sendRequestByMultipart(url, multiValueMap, String.class);

    }

    @Test
    void sendRequestByMulipart() {


    }
}