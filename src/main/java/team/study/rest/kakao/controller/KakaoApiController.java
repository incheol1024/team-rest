package team.study.rest.kakao.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.kakao.dto.UserTokenResponseDto;
import team.study.rest.kakao.service.AuthService;

@RestController
@RequestMapping("/kakao")
@Slf4j
@AllArgsConstructor
public class KakaoApiController {

    private final AuthService authService;

    @GetMapping("/accept/token")
    public ResponseEntity<UserTokenResponseDto> publishUserToken(@RequestParam("code") String code) {
        log.info("accepted code {}", code);
        ResponseEntity<UserTokenResponseDto> token = authService.getUserToken(code);
        return token;
    }







}
