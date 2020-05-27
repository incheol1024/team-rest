package team.study.rest.vision.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ImageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private static final String PREFIX_URL = "/image";

    @Test
    @Order(3)
    void getImage() throws Exception {
        this.mockMvc.perform(get(PREFIX_URL + "/1"))
                .andDo(print())
                .andExpect(status().isOk())
        ;
    }

    @Test
    @Order(1)
    void createImage() throws Exception {
        this.mockMvc.perform(post(PREFIX_URL)
                .content(""))
                .andDo(print())
                .andExpect(status().isOk())
        ;
    }

    @Test
    @Order(2)
    void patchImage() throws Exception {
        this.mockMvc.perform(patch(PREFIX_URL))
                .andDo(print())
                .andExpect(status().isOk())
                ;
    }

    @Test
    @Order(4)
    void deleteImage() throws Exception {
        this.mockMvc.perform(delete(PREFIX_URL))
                .andDo(print())
                .andExpect(status().isOk())
                ;
    }
}