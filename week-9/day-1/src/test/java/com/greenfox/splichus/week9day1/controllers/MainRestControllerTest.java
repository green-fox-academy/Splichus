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
        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is(15)))
                .andExpect(jsonPath("$.result", is(30)));
    }    @Test
    public void testDoublingWillFailWithError() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }
    @Test
    public void greeterWillPass() throws Exception {
        mockMvc.perform(get("/greeter?name=Splichus&title=Developer"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Splichus, my dear Developer!")));
    }
    @Test
    public void greeterWillFailWithErrorName() throws Exception {
        mockMvc.perform(get("/greeter?title=Developer"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }
    @Test
    public void greeterWillFailWithErrorTitle() throws Exception {
        mockMvc.perform(get("/greeter?name=Developer"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }
    @Test
    public void greeterWillFailWithErrorNameAndTitle() throws Exception {
        mockMvc.perform(get("/greeter"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Please provide name and title!")));
    }
    @Test
    public void appendWillPass() throws Exception {
    mockMvc.perform(get("/appenda/koz"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.appended", is("koza")));
    }
    @Test
    public void doUntilWillPassWithFactorial() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 3}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("result", is(6)));

    }
    @Test
    public void doUntilWillPassWithSum() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 3}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("result", is(6)));

    }
    @Test
    public void doUntilWillFailWithNoNumberWithSum() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("error", is("Please provide a number!")));

    }
    @Test
    public void doUntilWillFailWithNoNumberWithFactor() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("error", is("Please provide a number!")));

    }


    @Test
    public void arrays() {
    }

    @Test
    public void logs() {
    }
}