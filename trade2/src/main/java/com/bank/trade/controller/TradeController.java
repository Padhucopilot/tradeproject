package com.bank.trade.controller;

import com.bank.trade.domain.ProcessTrade;
import com.bank.trade.repository.TradeDetail;
import com.bank.trade.repository.TradeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TradeController {
    @Autowired
     private ProcessTrade processTrade;

    @PostMapping("/Trade")
    public ResponseEntity<TradeDetail> addTrade(@RequestBody TradeDetail tradeDetail )
    {

     processTrade.saveTrade(tradeDetail);

        return ResponseEntity.ok(tradeDetail);
    }

    @GetMapping ("/Trade/{id}")
    public ResponseEntity<String> getTrade(@PathVariable Long id ) throws JsonProcessingException {

        TradeDetail tradeInfo =processTrade.getTradeById(id);

        return ResponseEntity.ok(tradeInfo.toString());


    }
    @GetMapping ("/Trade")
    public ResponseEntity<String> getAllTrade() throws JsonProcessingException {

        List<TradeDetail> tradeInfo =processTrade.getAllTrade();

        return ResponseEntity.ok(tradeInfo.toString());


    }

    @DeleteMapping ("/Trade/{id}")
    public ResponseEntity<String> deleteTrade(@PathVariable Long id ) throws JsonProcessingException, Exception {

        String result = "Success";

        try {
             TradeDetail tradeInfo = processTrade.getTradeById(id);
         }catch (Exception e){
           result = e.getMessage();
         }
        try {
            processTrade.deleteTrade(id);
        }catch (Exception e){
            result = e.getMessage();
        }

         return ResponseEntity.ok(result);


    }

}
