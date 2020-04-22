package team.study.rest.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import team.study.rest.sample.dto.SampleDto;

@Service
public class SampleService {

/*
        @Autowired
    RestTemplate restTemplate;
*/


    public SampleDto findSample(String id) {
        SampleDto sampleDto = new SampleDto();
        sampleDto.setName(id);
        sampleDto.setAge(20);
        return sampleDto;
//        return restTemplate.getForObject("/url", SampleDto.class);
    }
}
