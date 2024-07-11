package com.bank.trade.domain;

import com.bank.trade.repository.TradeDetail;
import com.bank.trade.repository.TradeRepository;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProcessTradeTest {
   @Mock
   private ProcessTrade classToTest;
   @Mock
   private TradeRepository tradeRepository;

    @Test
    void saveTradeTest() {
        TradeDetail tradeDetail = new TradeDetail();
        tradeDetail.setId(1L);
        tradeDetail.setName("trade1");
        tradeDetail.setCreatedDate(Timestamp.valueOf("2024-08-31 20:00:00.0"));
        tradeDetail.setMaturityDate(Timestamp.valueOf("2025-08-31 20:00:00.0"));
        tradeDetail.setExpired(Boolean.valueOf("true"));
        tradeDetail.setVersion(1);
     //   Mockito.when(tradeRepository.save(tradeDetail)).thenReturn(tradeDetail);

         classToTest.saveTrade(tradeDetail);


    }

    @Test
    void getTradeByIdTest() {
        TradeDetail tradeDetail = new TradeDetail();
        tradeDetail.setId(1L);
        tradeDetail.setName("trade1");
      //  Mockito.when(tradeRepository.getReferenceById(1L)).thenReturn(tradeDetail);
       classToTest.getTradeById(1L);
    }

    @Test
    void getAllTradeTest() {
        List<TradeDetail> tradeDetailList = new ArrayList<>();
        TradeDetail tradeDetail = new TradeDetail();
        tradeDetail.setId(1L);
        tradeDetail.setName("trade1");
        tradeDetailList.add(tradeDetail);
        classToTest.getAllTrade();
    }

    @Test
    void deleteTradeTest() {
        TradeDetail tradeDetail = new TradeDetail();
        tradeDetail.setId(1L);
        tradeDetail.setName("trade1");
        //  Mockito.when(tradeRepository.getReferenceById(1L)).thenReturn(tradeDetail);
        classToTest.deleteTrade(1L);


    }
}