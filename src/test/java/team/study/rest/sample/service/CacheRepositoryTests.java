package team.study.rest.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.study.rest.sample.dto.SampleCache;
import team.study.rest.sample.repository.CacheRepository;

@SpringBootTest
public class CacheRepositoryTests {

    @Autowired
    private CacheRepository cacheRepository;

    @Test
    public void saveTest() {
        cacheRepository.save(SampleCache.builder().id("user1").pw("1234").build());
    }
}
