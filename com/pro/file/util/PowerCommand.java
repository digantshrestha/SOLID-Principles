package com.pro.file.util;

import com.pro.file.util.MathCommand;

public class PowerCommand extends MathCommand{
    @Override
    public double calculate(double x, double y) {
        double total=1;
        for(int i=1;i<=y;i++){
            total=total*x;
        }
        return total;
    }
}