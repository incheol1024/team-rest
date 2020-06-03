package team.study.rest.ebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.study.rest.ebook.domain.EBook;

public interface EBookRepository extends JpaRepository<EBook, Long> {
}
