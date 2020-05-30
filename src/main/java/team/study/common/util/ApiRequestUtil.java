package team.study.common.util;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.*;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

@Component
@Slf4j
public final class ApiRequestUtil {


    private static RestTemplate restTemplate;

    @Autowired
    private ApiRequestUtil(RestTemplate restTemplate) {
        ApiRequestUtil.restTemplate = restTemplate;
    }


    public static <T> T sendRequestByPost(URI uri, Map<String, ?> body, Class<T> returnType) {
        return restTemplate.postForEntity(uri, body, returnType).getBody();
    }

    @SneakyThrows
    public static <T> T sendRequestByMultipart(URI uri, MultiValueMap<String, Object> body, Class<T> returnType) {
        String url = "https://kapi.kakao.com/v1/vision/product/detect";
        MultiValueMap<String, String> multiValueMapHeader = new LinkedMultiValueMap<>();
        multiValueMapHeader.add(HttpHeaders.CONTENT_TYPE, MediaType.MULTIPART_FORM_DATA_VALUE);
        multiValueMapHeader.add("Authorization", "KakaoAK b83d6b24bfbd985bd873b8988bfba8d3");
        HttpHeaders httpHeaders = new HttpHeaders(multiValueMapHeader);
//        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
//        httpHeaders.add("Content-Type", "multipart/form-data");
//        httpHeaders.set("Authorization", "KakaoAK b83d6b24bfbd985bd873b8988bfba8d3");

        ContentDisposition contentDisposition = ContentDisposition
                .builder("form-data")
                .name("file")
                .filename("bags.jpg")
                .build();

        httpHeaders.add(HttpHeaders.CONTENT_DISPOSITION, contentDisposition.toString());

        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap();
        byte[] bytes = Files.readAllBytes(Paths.get("/Users/miyoungkim/Desktop/devImg", "bags.jpg"));
        multiValueMap.add("file", new ByteArrayResource(bytes));
        multiValueMap.add("filename", "bags.jpg");

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(multiValueMap, multiValueMapHeader);
        restTemplate.exchange(url, HttpMethod.POST, httpEntity, String.class);

        restTemplate.postForObject(uri, httpEntity, String.class);
        return restTemplate.postForEntity(uri, httpEntity, returnType).getBody();
    }

    private static <T> RequestEntity<T> getRequestEntity(Class<T> bodyType) {
        return null;
    }

    static class MultipartInputStreamFileResource extends InputStreamResource {

        private final String filename;

        MultipartInputStreamFileResource(InputStream inputStream, String filename) {
            super(inputStream);
            this.filename = filename;
        }

        @Override
        public String getFilename() {
            return this.filename;
        }

        @Override
        public long contentLength() throws IOException {
            return -1; // we do not want to generally read the whole stream into memory ...
        }
    }

}
