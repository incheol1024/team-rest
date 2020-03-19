package team.study.rest.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.sample.dto.SampleDto;
import team.study.rest.sample.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    SampleService sampleService;


    @GetMapping("")
    public ResponseEntity<SampleDto> findSample(SampleDto sampleDto) {
        return sampleService.findSample(sampleDto);
    }
}
