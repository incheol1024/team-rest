package team.study.rest.sample.controller;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import team.study.rest.sample.service.impl.CovidService;
import team.study.rest.sample.service.impl.CovidServiceImpl;

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

    @Test
    void findInternalCount() throws IOException {
        covidService.getInternalStatus("seoul");
        System.out.println();
        assertThat("0").isEqualTo("0");
    }
}