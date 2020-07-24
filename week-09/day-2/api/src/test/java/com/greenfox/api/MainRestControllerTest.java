package com.greenfox.api;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.greenfox.api.Controllers.MainRestController;
import com.greenfox.api.Services.LogService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
public class MainRestControllerTest {

  private MockMvc mockMvc;

  @Mock
  private LogService logService;

  @Mock
  private LogService actionService;

  @Mock
  private LogService operationArrayProcess;

  @Before
  public void setup() {
    mockMvc = standaloneSetup(new MainRestController(logService)).build();
  }

  @Test
  public void testTest() {
    assertTrue(true);
  }

  @Test
  public void doublingTest_ifEmpty() throws Exception {
    mockMvc.perform(get("/doubling"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void doublingTest() throws Exception {
    when(restService.doubling(4)).thenReturn(new DoublingResult(4, 8));
    mockMvc.perform(get("/doubling").param("input", "4"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(8)));
  }

  @Test
  public void greeter() throws Exception {
    when(restService.greeting("Zoli", "student"))
        .thenReturn(new WelcomeMessage("Zoli", "student"));
    mockMvc.perform(get("/greeter").param("name", "Zoli").param("title", "student"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Zoli, my dear student!")));
  }

  @Test
  public void greeter_ifNoNameAndNoTitle() throws Exception {
    mockMvc.perform(get("/greeter"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Please provide a name and a title!")));
  }

  @Test
  public void greeter_ifNoName() throws Exception {
    mockMvc.perform(get("/greeter").param("title", "student"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeter_ifNoTitle() throws Exception {
    mockMvc.perform(get("/greeter").param("name", "Zoli"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }

  @Test
  public void appendA() throws Exception {
    when(restService.appendA("kuty")).thenReturn(new Appended("kuty"));
    mockMvc.perform(get("/appenda/kuty"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.appended", is("kutya")));
  }

  @Test
  public void appendA_ifNoAppendable() throws Exception {
    mockMvc.perform(get("/appenda/"))
        .andExpect(status().isNotFound());
  }

}
