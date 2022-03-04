package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        double radiusDouble = radius.doubleValue();
        if(radiusDouble < 0){
            System.out.println("Error input positive number");
        }
          return Math.PI * radiusDouble * radiusDouble;

    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        double lengthDouble = length.doubleValue();
        double widthDouble = width.doubleValue();
        if (lengthDouble < 0 || widthDouble < 0){
            System.out.println("Error input positive number");
        }
        return lengthDouble * widthDouble;
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        double baseDouble = base.doubleValue();
        double hDouble = h.doubleValue();
        if (baseDouble < 0 || hDouble < 0) {
            System.out.println("Error input positive number");
        }
        return baseDouble * hDouble * 0.5;
    }
}
