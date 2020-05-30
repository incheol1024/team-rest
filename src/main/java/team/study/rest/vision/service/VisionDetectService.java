package team.study.rest.vision.service;

import org.springframework.web.multipart.MultipartFile;
import team.study.rest.vision.entity.Image;
import team.study.rest.vision.entity.Product;

import java.util.List;

public interface VisionDetectService {


    List<Product> getProducts(long imageId);

    Image analysisImage(MultipartFile multipartFile);
}
