package team.study.common.constant;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("config.kakao")
public class KakaoProperties {

    private String defaultUrl;

    private String authUrl;

    private String tokenUrl;

    private String redirectUrl;

    private String clientId;

    private String grantType;


}
