package team.study.rest.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.study.rest.sample.dto.SampleDto;

public interface HibernateRepository extends JpaRepository<SampleDto, String> {
}
