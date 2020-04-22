package team.study.rest.kakao.dto;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import team.study.common.constant.KakaoProperties;

@Component
@AllArgsConstructor
public class DataObjectFactory {

    private final KakaoProperties kakaoProperties;

    public UserTokenRequestDto createUserTokenRequest(String code) {
        return new UserTokenRequestDto(
                kakaoProperties.getGrantType(),
                kakaoProperties.getClientId(),
                kakaoProperties.getRedirectUrl(),
                code
        );
    }


}
