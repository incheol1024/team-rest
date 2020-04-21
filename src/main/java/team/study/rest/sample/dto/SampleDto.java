package team.study.rest.sample.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.web.bind.annotation.GetMapping;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("SampleDTO")
public class SampleDto {

    @Id
    private String name;

    private int age;

}
