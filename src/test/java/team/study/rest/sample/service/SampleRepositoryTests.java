package team.study.rest.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.study.rest.sample.dto.SampleDto;

@SpringBootTest
public class SampleRepositoryTests {

    @Autowired
    private SampleRepository sampleRepository;

    @Test
    public void saveTest() {
        sampleRepository.save(SampleDto.builder().name("홍길동").age(20).build());
    }
}
