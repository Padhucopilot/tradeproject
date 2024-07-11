package com.bank.trade.repository;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import jakarta.persistence.*;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


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
