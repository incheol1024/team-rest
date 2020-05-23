package team.study.rest.vision.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class ProductDetectionResponseDto {

    Result result;

    @Data
    static class Result {

        private int width;

        private int height;

        private List<Object> objects;

    }

    @Data
    static class Object {

        private int x1;

        private int y1;

        private int x2;

        private int y2;

        private String Class;

    }
}
