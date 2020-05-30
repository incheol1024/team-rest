package team.study.rest.vision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.study.rest.vision.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
