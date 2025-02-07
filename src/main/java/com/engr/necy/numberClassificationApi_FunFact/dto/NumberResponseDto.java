package com.engr.necy.numberClassificationApi_FunFact.dto;

import java.util.List;
public class NumberResponseDto {
    private int number;
    private Boolean is_prime;
    private Boolean is_perfect;
    private List<String> properties;
    private int digit_sum;
    private String fun_fact;

    public NumberResponseDto(int number, Boolean is_prime, Boolean is_perfect, List<String> properties, int digit_sum, String fun_fact) {
        this.number = number;
        this.is_prime = is_prime;
        this.is_perfect = is_perfect;
        this.properties = properties;
        this.digit_sum = digit_sum;
        this.fun_fact = fun_fact;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Boolean getIs_prime() {
        return is_prime;
    }

    public void setIs_prime(Boolean is_prime) {
        this.is_prime = is_prime;
    }

    public Boolean getIs_perfect() {
        return is_perfect;
    }

    public void setIs_perfect(Boolean is_perfect) {
        this.is_perfect = is_perfect;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public int getDigit_sum() {
        return digit_sum;
    }

    public void setDigit_sum(int digit_sum) {
        this.digit_sum = digit_sum;
    }

    public String getFun_fact() {
        return fun_fact;
    }

    public void setFun_fact(String fun_fact) {
        this.fun_fact = fun_fact;
    }
}
