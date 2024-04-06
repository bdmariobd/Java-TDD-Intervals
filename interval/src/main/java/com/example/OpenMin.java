package com.example;

public class OpenMin extends Min {

    public OpenMin(double number) {
        super(number);
    }

    @Override
    public boolean lessThan(double number) {
        return super.lessThan(number) || this.number == number;
    }
}
