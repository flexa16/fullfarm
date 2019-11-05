package by.flex.controller;


import by.flex.pojoss.devices.Dispenser;
import by.flex.pojoss.sensors.DispenserSensors;
import by.flex.repo.DispenserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DispenserControllerTest {
    private HttpMessageConverter mappingJackson2HttpMessageConverter;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    private ObjectMapper mapper;

    @Autowired
    DispenserRepository repository;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    void setConverters(HttpMessageConverter<?>[] converters) {
        this.mappingJackson2HttpMessageConverter = Arrays.stream(converters).
                filter(
                        converter -> converter instanceof MappingJackson2HttpMessageConverter).
                findAny().get();
    }

    public String name = "Disp76878";

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        mapper  = new ObjectMapper();
    }
    @Test
    public void createDispenser() throws Exception {

        assertNotNull(mockMvc);
        assertNotNull(mapper);
        mockMvc.perform(post("/addDispenser")
               .content(mapper.writeValueAsString(new Dispenser(1,name,12,new DispenserSensors())))
               .contentType(contentType)).andExpect(status().isOk());
        Dispenser dispenser = repository.findByName(name);
        assertNotNull(dispenser);
    }
}