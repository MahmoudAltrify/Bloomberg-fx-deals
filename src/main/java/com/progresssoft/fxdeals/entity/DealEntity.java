package com.progresssoft.fxdeals.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "deals")
public class DealEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from_currency", nullable = false)
    private String fromCurrency;
    @Column(name = "to_currency", nullable = false)
    private String toCurrency;
    @Column(name = "deal_time", nullable = false)
    private LocalDateTime dealTime;
    @Column(nullable = false)
    private BigDecimal amount;
}
