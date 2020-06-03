package team.study.rest.vision.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import team.study.rest.vision.dto.ImageDto;
import team.study.rest.vision.entity.Image;
import team.study.rest.vision.service.ImageService;

@RestController
@RequestMapping("/image")
@RequiredArgsConstructor
@Api(value = "이미지 메타 데이터 CRUD", tags = "이미지 메타 정보")
public class ImageController {

    private ImageService imageService;

    @GetMapping("/{id}")
    @ApiOperation(value = "이미지 메타 조회", tags = "이미지 메타 조회")
    public Image getImage(@PathVariable long id) {
        return imageService.getImage(id);
    }

    @PostMapping
    public Image createImage(ImageDto imageDto) {
        return imageService.createImage(imageDto);
    }

    @PatchMapping
    public Image patchImage(ImageDto imageDto) {
        return imageService.patchImage(imageDto);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(long id) {
        imageService.deleteImage(id);
    }

}
