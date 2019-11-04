package by.flex.controllers;

import by.flex.service.GraphService;
import by.flex.services.servicesd.DispenserServiceDashboard;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DevicesControllerTest {


    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    DispenserServiceDashboard dispenserServiceDashboard;

    MockMvc mockMvc;

    @Autowired
    GraphService graphService;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    @Test
    public void devicesList() throws Exception {
        assertNotNull(mockMvc);
        ModelAndView modelAndView =
                    mockMvc.perform(get("/devices")).andReturn()
                .getModelAndView();
        assertNotNull(modelAndView);
      List list = (List) modelAndView.getModel().get("dispenser");
      assertNotNull(list);
      assertEquals(10,list.size());
    }

    @Test
    public void graphs() throws Exception {
        ModelAndView modelAndView =
                mockMvc.perform(post("/graphs")).andReturn()
                        .getModelAndView();
        assertNotNull(modelAndView);
        String actual = (String) modelAndView.getModel().get("values");

        String expected = graphService.dataString(
                graphService.dispenserDataList(
                        dispenserServiceDashboard.getEntity(10)));
        assertEquals(expected,actual);
    }
}