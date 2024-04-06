package com.example;

public class OpenMax extends Max{

    public OpenMax(double number) {
        super(number, true);
    }

    @Override
    public boolean greaterThan(double number) {
        return false;
    }
}
