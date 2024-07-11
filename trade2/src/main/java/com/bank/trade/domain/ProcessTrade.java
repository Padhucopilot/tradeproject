package com.bank.trade.domain;

import com.bank.trade.repository.TradeDetail;
import com.bank.trade.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessTrade {
    @Autowired
    private TradeRepository tradeRepository;

    public TradeDetail saveTrade(TradeDetail tradeDetail) {

        return tradeRepository.save(tradeDetail);
    }

    public TradeDetail getTradeById(Long id) {

        return tradeRepository.getReferenceById(id);
    }

    public List<TradeDetail> getAllTrade() {

        return tradeRepository.findAll();
    }

    public void deleteTrade(Long id) {

       //TradeDetail trade =tradeRepository.getReferenceById(id)
        tradeRepository.deleteById(id);
    }
}
