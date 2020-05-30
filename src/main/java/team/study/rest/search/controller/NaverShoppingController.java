package team.study.rest.search.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.vision.entity.Product;

import java.util.List;

@RestController
@RequestMapping("/search")
@Api("네이버 쇼핑 상품 목록을 조회")
public class NaverShoppingController {


    @GetMapping("/shopping/{id}")
    public List<Product> getProducts(@PathVariable long id) {
        return null;
    }
}
