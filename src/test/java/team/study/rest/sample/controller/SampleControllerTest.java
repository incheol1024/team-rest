package team.study.rest.sample.controller;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;
import team.study.rest.city.common.XMLParseHandler;
import team.study.rest.city.dto.CityCovidDTO;
import team.study.rest.sample.service.impl.CovidService;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class SampleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CovidService covidService;

    @Test
    void findSample() throws Exception {
        this.mockMvc
                .perform(get("/sample").param("id", "test"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", IsEqual.equalTo("test")))
                .andExpect(jsonPath("$.age", IsEqual.equalTo(20)))
        ;
    }

    // restTemplate가 안될 상황을 대비해서 테스트
    @Test
    void tempFindCityAPI() {
        XMLParseHandler parseHandler = new XMLParseHandler(new RestTemplate(), new CityCovidDTO());
        parseHandler.httpConnectionTest();
    }

    // controller로 uri 요청하여 test
    @Test
    void findCityAPI() throws Exception {
        this.mockMvc
                .perform(get("/city/list"))
                .andDo(print())
                .andExpect(status().isOk())
        ;
    }

    @Test
    void findInternalCount() throws IOException {
        covidService.getInternalStatus("seoul");
        System.out.println();
        assertThat("0").isEqualTo("0");
    }
}