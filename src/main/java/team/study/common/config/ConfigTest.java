package team.study.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ConfigurationProperties("air")
@Data
public class ConfigTest {

    Map<String, Provider> map = new HashMap<>();


    @Data
    public static class Provider {

        String name;

        String url;
    }
}
