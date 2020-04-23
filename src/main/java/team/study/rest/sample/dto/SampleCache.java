package team.study.rest.sample.dto;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RedisHash("Sample")
public class SampleCache {
    private String id;
    private String pw;
}
