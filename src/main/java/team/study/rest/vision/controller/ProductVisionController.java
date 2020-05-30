package team.study.rest.vision.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import team.study.rest.vision.entity.Image;
import team.study.rest.vision.entity.Product;
import team.study.rest.vision.service.VisionDetectService;

import java.util.List;

@Api(produces = MediaType.APPLICATION_JSON_VALUE, value = "이미지 API")
@RestController
@RequestMapping("/vision")
public class ProductVisionController {

    @Autowired
    @Qualifier("visionDetectProductService")
    VisionDetectService visionDetectService;

    @GetMapping("/{imageId}")
    @ApiOperation(value = "이미지 상품 목록 조회", tags = "상품 목록")
    public List<Product> getProducts(@PathVariable long imageId) {
        return visionDetectService.getProducts(imageId);
    }

    @PostMapping
    @ApiOperation(value = "이미지 분석 요청", tags = "이미지 분석")
    public Image analysisImage(MultipartFile multipartFile) {
        return visionDetectService.analysisImage(multipartFile);
    }




}
