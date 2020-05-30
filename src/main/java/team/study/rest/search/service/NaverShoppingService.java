package team.study.rest.search.service;

import org.springframework.stereotype.Service;
import team.study.rest.vision.entity.Image;
import team.study.rest.vision.entity.Product;

import java.util.List;
import java.util.function.Supplier;

/**
 *
 * <p>
 *
 * @author Hwang In Cheol
 * @since 1.0
 * @version 1.0
 *
 */

@Service
public class NaverShoppingService implements ShoppingService{

    @Override
    public List<Product> getProducts(Image image) {
        return null;
    }

    @Override
    public List<Product> getProducts(Supplier<Image> supplier) {
        return null;
    }
}
