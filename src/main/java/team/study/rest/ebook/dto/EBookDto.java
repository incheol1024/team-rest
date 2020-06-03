package team.study.rest.ebook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import team.study.rest.ebook.domain.EBook;

@Getter
@Setter
@NoArgsConstructor
public class EBookDto {

    private String title;
    private String path;

    public EBook toEntity(){
        return EBook.builder()
                .title(this.title)
                .path(this.path)
                .build();
    }
}
