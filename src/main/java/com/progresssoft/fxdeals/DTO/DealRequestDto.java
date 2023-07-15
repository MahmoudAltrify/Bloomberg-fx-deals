package com.progresssoft.fxdeals.DTO;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class DealRequestDto {


    @Size(max = 3, min = 3, message = "Currency should be 3 characters")
    @NotEmpty(message = "Required field <fromCurrency>")
    private String fromCurrency;
    @Size(max = 3, min = 3, message = "Currency should be 3 characters")
    @NotEmpty(message = "Required field <toCurrency>")
    private String toCurrency;
    private BigDecimal amount;

    public DealRequestDto(String fromCurrency, String toCurrency, BigDecimal amount) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
    }

    public DealRequestDto() {

    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
