package com.greenfox.splichus.week9day1.controllers;

import com.greenfox.splichus.week9day1.repositories.LogRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
public class MainRestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LogRepo logRepo;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testDoublingWillPass() throws Exception {
        mockMvc.perform(post("/doubling?input=15"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is(15)))
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void greeter() {
    }

    @Test
    public void append() {
    }

    @Test
    public void doUntil() {
    }

    @Test
    public void arrays() {
    }

    @Test
    public void logs() {
    }
}