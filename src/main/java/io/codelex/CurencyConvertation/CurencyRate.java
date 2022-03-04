package io.codelex.CurencyConvertation;

import java.math.BigDecimal;

public class CurencyRate {
    private String code;
    private BigDecimal rate;

    public CurencyRate(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }
}
