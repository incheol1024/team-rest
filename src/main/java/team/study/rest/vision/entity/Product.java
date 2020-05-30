package team.study.rest.vision.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@ToString
public class Product {

    @Id
    private long productId;

    private String productName;

    private String productDetailName;

    private int productType;

    @ManyToOne
    private Image image;

}
