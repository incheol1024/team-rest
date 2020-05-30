package team.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableAspectJAutoProxy
@SpringBootApplication
public class TeamRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamRestApplication.class, args);
    }

}
