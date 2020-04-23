package team.study.rest.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.study.rest.sample.dto.SampleDto;

@SpringBootTest
public class SampleCacheRepositoryTests {

    @Autowired
    private SampleCacheRepository sampleCacheRepository;

    @Test
    public void saveTest() {
        sampleCacheRepository.save(SampleDto.builder().name("홍길동").age(20).build());
    }
}
