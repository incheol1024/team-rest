package team.study.rest.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.study.rest.sample.dto.SampleDto;
import team.study.rest.sample.repository.HibernateRepository;

@SpringBootTest
public class HibernateRepositoryTests {

    @Autowired
    private HibernateRepository hibernateRepository;

    @Test
    public void saveTest() {
        hibernateRepository.save(SampleDto.builder().name("홍길동").age(20).build());
    }
}
