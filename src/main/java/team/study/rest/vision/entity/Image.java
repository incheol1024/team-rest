package team.study.rest.vision.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Image {

    @Id
    private long imageId;

    private String imageName;

    private long imageSize;

    @OneToMany
    private List<Product> products;


}
