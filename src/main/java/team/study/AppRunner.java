package team.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import team.study.common.config.ConfigTest;

@Component
public class AppRunner implements ApplicationRunner {


    @Autowired
    ConfigTest configTest;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        configTest.getMap()
                .keySet()
                .forEach(System.out::println);

        configTest.getMap()
                .entrySet()
                .forEach(stringProviderEntry -> System.out.println(stringProviderEntry.getValue()));

    }
}
