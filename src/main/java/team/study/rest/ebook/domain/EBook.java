package team.study.rest.ebook.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "tbl_ebook")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 1000)
    private String path;

    @Builder
    public EBook(String title, String path) {
        this.title = title;
        this.path = path;
    }
}
