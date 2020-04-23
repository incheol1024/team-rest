package team.study.rest.sample.service;

import org.springframework.data.repository.CrudRepository;
import team.study.rest.sample.dto.SampleDto;

public interface SampleCacheRepository extends CrudRepository<SampleDto, String> {
}
