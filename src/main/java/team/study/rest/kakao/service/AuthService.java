package team.study.rest.kakao.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import sun.misc.Request;
import team.study.common.constant.KakaoProperties;
import team.study.rest.kakao.dto.DataObjectFactory;
import team.study.rest.kakao.dto.UserTokenRequestDto;
import team.study.rest.kakao.dto.UserTokenResponseDto;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class AuthService {

    private final RestTemplateBuilder restTemplateBuilder;

    private final RestTemplate restTemplate;

    private final DataObjectFactory dataObjectFactory;

    private final KakaoProperties kakaoProperties;



    public ResponseEntity<UserTokenResponseDto> getUserToken(String code) {
        restTemplate.getMessageConverters().stream().forEach(System.out::println);

        UserTokenRequestDto userTokenRequest = dataObjectFactory.createUserTokenRequest(code);

        log.info("{}", userTokenRequest);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        RequestEntity<UserTokenRequestDto> requestEntity =
                RequestEntity
                        .post(URI.create(kakaoProperties.getTokenUrl()))
                        .headers(httpHeaders)
                        .body(userTokenRequest);

        log.info("{}", requestEntity);

/*
        ResponseEntity<UserTokenResponseDto> exchange =
                restTemplate.exchange(requestEntity, UserTokenResponseDto.class);
*/

        MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
        body.add("grant_type", kakaoProperties.getGrantType());
        body.add("client_id",kakaoProperties.getClientId());
        body.add("redirect_uri",kakaoProperties.getRedirectUrl());
        body.add("code",code);

        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity<>(body, httpHeaders);

//        RestTemplate restTemplate = restTemplateBuilder.build();
/*        List<HttpMessageConverter<?>> messageConverters =
                build.getMessageConverters();

        messageConverters.stream().forEach(System.out::println);*/
        ResponseEntity<UserTokenResponseDto> userTokenResponseDtoResponseEntity = restTemplate.postForEntity(kakaoProperties.getTokenUrl(), httpEntity, UserTokenResponseDto.class);
        log.info("{}", userTokenResponseDtoResponseEntity);
        return userTokenResponseDtoResponseEntity;
//        return userTokenResponseDtoResponseEntity;
    }
}
