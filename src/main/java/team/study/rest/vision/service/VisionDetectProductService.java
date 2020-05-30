package team.study.rest.vision.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import team.study.rest.vision.entity.Image;
import team.study.rest.vision.entity.Product;
import team.study.rest.vision.repository.ImageRepository;
import team.study.rest.vision.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class VisionDetectProductService implements VisionDetectService {


    private ProductRepository productRepository;

    private ImageRepository imageRepository;


    @Override
    public List<Product> getProducts(long imageId) {
        Image image = imageRepository.findById(imageId).orElseThrow(() -> new RuntimeException("not Found"));
        return image.getProducts();
    }

    @Override
    public Image analysisImage(MultipartFile multipartFile) {
        // TODO: 2020/05/23 이미지 분석하는 api 사용 로직 들어가야함

        Image image = new Image();
        image.setImageName(multipartFile.getOriginalFilename());
        image.setImageSize(multipartFile.getSize());
        List<Product> list = new ArrayList(); // 이미지에서 분석된 상품 목록이 들어감
        image.setProducts(list);
        return imageRepository.save(image);
    }
}
