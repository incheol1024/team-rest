package team.study.rest.search.service;

import team.study.rest.vision.entity.Image;
import team.study.rest.vision.entity.Product;

import java.util.List;
import java.util.function.Supplier;

/**
 * shopping service
 * <p>
 *
 * @author Hwang In Cheol
 * @since 1.0
 * @version 1.0
 *
 */
public interface ShoppingService {



    List<Product> getProducts(Image image);

    List<Product> getProducts(Supplier<Image> supplier);

}
