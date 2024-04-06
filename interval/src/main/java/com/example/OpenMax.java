package com.example;

public class OpenMax extends Max{

    public OpenMax(double number) {
        super(number);
    }

    @Override
    public boolean greaterThan(double number) {
        return super.greaterThan(number) || this.number == number;
    }
}
