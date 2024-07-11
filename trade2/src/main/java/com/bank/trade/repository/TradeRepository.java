package com.bank.trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TradeRepository extends JpaRepository<TradeDetail, Long> {


   @Modifying
   @Query(value = "DELETE FROM TradeDetail f WHERE f.id = ?1")
   void deleteById(Long id);

}
