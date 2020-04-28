package team.study.rest.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import team.study.rest.sample.dto.SampleDto;
import team.study.rest.sample.repository.HibernateRepository;

@DataJpaTest
public class HibernateRepositoryTests {

    @Autowired
    private HibernateRepository hibernateRepository;

    @Test
    public void findAllTest() {
        hibernateRepository.findAll();
    }

    @Test
    public void saveTest() {
        hibernateRepository.save(SampleDto.builder().name("이투스").age(20).build());
    }
}
