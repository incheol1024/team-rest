package team.study.rest.sample.service.impl;

import team.study.rest.sample.dto.CovidResponseDto;

import java.io.IOException;
import java.util.List;

public interface CovidService {
    String getInternalStatus(String locale) throws IOException;
}
