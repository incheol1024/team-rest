package team.study.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import team.study.common.constant.KakaoProperties;

@Configuration
@EnableConfigurationProperties(KakaoProperties.class)
public class AppConfig {



}
