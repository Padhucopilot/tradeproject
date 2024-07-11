package com.bank.trade.repository;

import jakarta.persistence.*;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Data
public class TradeDetail implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Timestamp createdDate;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Timestamp maturityDate;
    private Boolean expired;
    @Column(unique = true)
    private Integer version;

}
