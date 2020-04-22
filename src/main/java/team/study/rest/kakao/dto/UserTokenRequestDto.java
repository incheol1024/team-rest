package team.study.rest.kakao.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTokenRequestDto {

    private String grant_type;  // authorization_code로 고정

    private String client_id;   //앱 생성 시 발급 받은 REST API

    private String redirect_uri;  //코드가 리다이렉트된 URI

    private String code;  //  코드 받기 요청으로 얻은 인증 코드

//    private String clientSecret;  // 토큰 발급 시, 보안을 강화하기 위해 추가 확인하는 코드 (선택)


    @Override
    public String toString() {
        return "grant_type='" + grant_type + '\'' +
                ", client_id='" + client_id + '\'' +
                ", redirect_uri='" + redirect_uri + '\'' +
                ", code='" + code + '\''
                ;
    }
}
