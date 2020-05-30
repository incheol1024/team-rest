package team.study.rest.vision.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import team.study.common.util.ModelMapperUtil;
import team.study.rest.vision.dto.ImageDto;
import team.study.rest.vision.entity.Image;
import team.study.rest.vision.repository.ImageRepository;

@Service
@AllArgsConstructor
public class ImageService {

    private ImageRepository imageRepository;

    public Image getImage(long id) {
        return imageRepository.getOne(id);
    }

    public Image createImage(ImageDto imageDto) {
        Image image = ModelMapperUtil.convertTo(imageDto, Image.class);
        return imageRepository.save(image);
    }

    public Image patchImage(ImageDto imageDto) {
        Image image = ModelMapperUtil.convertTo(imageDto, Image.class);
        return imageRepository.save(image);
    }

    public void deleteImage(long id) {
        imageRepository.deleteById(id);
    }

}
