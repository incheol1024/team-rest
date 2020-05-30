package team.study.rest.vision.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProductVisionControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private static final String PREFIX_URL = "/vision";

    @Test
    void getProducts() throws Exception {
        long imageId = 1;

        this.mockMvc.perform(get(PREFIX_URL.concat("/") + imageId))
                .andDo(print())
                .andExpect(status().is5xxServerError());
    }

    @Test
    void analysisImage() {
    }
}