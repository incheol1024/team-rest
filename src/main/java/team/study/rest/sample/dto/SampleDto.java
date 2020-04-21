package team.study.rest.sample.dto;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tlb_sample")
//@RedisHash("SampleDTO")
public class SampleDto {

    @Id
    private String name;

    private int age;

}
