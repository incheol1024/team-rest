package team.study.rest.sample.service;

import org.springframework.data.jpa.repository.JpaRepository;
import team.study.rest.sample.dto.SampleDto;

public interface SampleRepository extends JpaRepository<SampleDto, String> {
}
