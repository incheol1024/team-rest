package team.study.rest.vision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.study.rest.vision.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
