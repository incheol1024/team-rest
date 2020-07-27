package team.study.common.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "provider")
@Setter
@Getter
public class ProviderProperties {

    private KaKaoProperties kakao;

    @Getter
    @Setter
    public static class KaKaoProperties {

        private String apiKey;

        private Map<String, String> url = new HashMap<>();

    }

}
