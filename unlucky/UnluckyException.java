package com.company;

public class UnluckyException extends Exception{
    @Override
    public String getMessage() {
        return "Unlucky Error";
    }
}
