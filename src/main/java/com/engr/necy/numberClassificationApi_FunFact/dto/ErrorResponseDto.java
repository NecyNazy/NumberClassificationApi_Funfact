package com.engr.necy.numberClassificationApi_FunFact.dto;

public class ErrorResponseDto {
    private String number;
    private Boolean error;

    public ErrorResponseDto(String number, Boolean error) {
        this.number = number;
        this.error = error;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
