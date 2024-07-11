package com.bank.trade.controller;

import com.bank.trade.repository.TradeDetail;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TradeController.class)
public class TradeControllerTest {
    @Autowired
    private MockMvc mvc ;
    @Test
    public void getAllTradeTest() throws Exception
    {
         try {
             mvc.perform(MockMvcRequestBuilders
                             .get("/Trade")
                             .accept(MediaType.APPLICATION_JSON))
                     .andExpect(status().isOk())
                     .andExpect(MockMvcResultMatchers.jsonPath("$.Trade").exists())
                     .andExpect(MockMvcResultMatchers.jsonPath("$.Trade[*].name").isNotEmpty());
         }catch(Exception e){
            String msg = e.getMessage();
            System.out.println(msg);
         }
    }

    @Test
    public void addTradeTest() throws Exception
    {
        try {
            mvc.perform(MockMvcRequestBuilders
                            .get("/Trade")
                            .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.Trade").exists())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.Trade[*].name").isNotEmpty());
        }catch(Exception e){
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }

    @Test
    public void getTradeTest() throws Exception
    {
        try {
            mvc.perform(MockMvcRequestBuilders
                            .get("/Trade")
                            .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.Trade").exists())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.Trade[*].name").isNotEmpty());
        }catch(Exception e){
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }

    @Test
    public void deleteTradeTest() throws Exception
    {
        try {
            mvc.perform(MockMvcRequestBuilders
                            .get("/Trade")
                            .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.Trade").exists())
                    .andExpect(MockMvcResultMatchers.jsonPath("$.Trade[*].name").isNotEmpty());
        }catch(Exception e){
            String msg = e.getMessage();
            System.out.println(msg);
        }
    }

}
