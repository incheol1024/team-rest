package team.study.rest.kakao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.kakao.service.AuthService;

@RestController
@RequestMapping("/oauth")
@Slf4j
public class AuthController {

    @Autowired
    AuthService authService;

    @GetMapping("/authorize")
    public HttpEntity<String> auth() {
      log.info("auth");
       return authService.kakaoAuth();
    }
}
