package team.study.common.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;
import team.study.rest.vision.dto.ImageDto;
import team.study.rest.vision.entity.Image;

import static org.junit.jupiter.api.Assertions.*;

class ModelMapperUtilTest {

    @Test
    void convertTo() {
        String expectedName = "names";
        long expectedSize = 100L;

        ImageDto imageDto = new ImageDto();
        imageDto.setImageName(expectedName);
        imageDto.setImageSize(expectedSize);

        Image actual = ModelMapperUtil.convertTo(imageDto, Image.class);

        Assertions.assertThat(actual)
                .isNotNull();

        Assertions.assertThat(actual)
                .extracting(Image::getImageName)
                .isEqualTo(expectedName);

        Assertions.assertThat(actual)
                .extracting(Image::getImageSize)
                .isEqualTo(expectedSize);

        Assertions.assertThat(actual)
                .extracting(Image::getImageId)
                .isEqualTo(0L);

        Assertions.assertThat(actual)
                .extracting(Image::getProducts)
                .isNull();

    }
}