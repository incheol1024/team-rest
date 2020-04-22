package team.study.rest.kakao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserTokenResponseDto {

    private String access_token;  // 사용자 액세스 토큰 값

    private String token_type;  // 토큰 타입(OAuth2.0 bearer Authentication)

    private String refresh_token;  // 사용자 리프레시 토큰 값

    private String expires_in;  // 토큰 만료 시간(초)

    private String scope;  // 인증된 사용자의 정보 조회 권한 범위


}
