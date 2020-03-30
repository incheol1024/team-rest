package team.study.rest.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.sample.dto.SampleDto;
import team.study.rest.sample.service.SampleService;

@RestController
@RequestMapping("/sample")
@Slf4j
public class SampleController {

    @Autowired
    SampleService sampleService;


    @GetMapping("")
    public ResponseEntity<SampleDto> findSample(@RequestParam(name = "id") String id) {
        log.error("id: {}", id);
        return ResponseEntity.ok(sampleService.findSample(id));
    }
}
