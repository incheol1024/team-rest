package team.study.rest.sample.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.study.rest.sample.dto.SampleDto;
import team.study.rest.sample.repository.HibernateRepository;
import team.study.rest.sample.service.SampleService;

@RestController
@RequestMapping("/sample")
@Slf4j
@RequiredArgsConstructor
public class SampleController {

    private final HibernateRepository hibernateRepository;

    @GetMapping("")
    public ResponseEntity<SampleDto> findSample(SampleDto sampleDto) {
        return ResponseEntity.ok(hibernateRepository.save(sampleDto));
    }
}
