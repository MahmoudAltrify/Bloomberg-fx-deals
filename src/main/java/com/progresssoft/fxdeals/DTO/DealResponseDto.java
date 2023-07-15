package com.progresssoft.fxdeals.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;


// Should be implemented for constructors
public class DealResponseDto {
    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private LocalDateTime dealTime;
    private BigDecimal amount;

    public DealResponseDto(Long id, String fromCurrency, String toCurrency, LocalDateTime dealTime, BigDecimal amount) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.dealTime = dealTime;
        this.amount = amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public void setDealTime(LocalDateTime dealTime) {
        this.dealTime = dealTime;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public LocalDateTime getDealTime() {
        return dealTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
