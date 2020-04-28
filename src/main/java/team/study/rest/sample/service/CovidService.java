package team.study.rest.sample.service;

import team.study.rest.sample.dto.CovidRequestDto;

import java.io.IOException;

public interface CovidService {
    String getInternalStatus(String locale) throws IOException;

    // 외부 API Request 셋팅
    void setRequest(CovidRequestDto request);
    // 외부 API Response
    Object getResponse();
}
