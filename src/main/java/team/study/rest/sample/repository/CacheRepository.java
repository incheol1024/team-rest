package team.study.rest.sample.repository;

import org.springframework.data.repository.CrudRepository;
import team.study.rest.sample.dto.SampleCache;
import team.study.rest.sample.dto.SampleDto;

public interface CacheRepository extends CrudRepository<SampleCache, String> {
}
