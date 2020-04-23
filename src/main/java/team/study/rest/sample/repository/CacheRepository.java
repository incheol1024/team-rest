package team.study.rest.sample.repository;

import org.springframework.data.repository.CrudRepository;
import team.study.rest.sample.dto.SampleCache;

public interface CacheRepository extends CrudRepository<SampleCache, String> {
}
