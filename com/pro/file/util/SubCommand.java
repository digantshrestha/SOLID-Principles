package com.pro.file.util;

import com.pro.file.util.MathCommand;

public class SubCommand extends MathCommand{
    @Override
    public double calculate(double x, double y) {
        return x-y;
    }
}