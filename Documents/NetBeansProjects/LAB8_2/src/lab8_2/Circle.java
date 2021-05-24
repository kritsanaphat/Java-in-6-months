/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_2;

/**
 *
 * @author Kritsanaphat
 */
public class Circle extends Geometric{
   private double raduis;
   private String color;
   private Boolean isFilled;

    public Circle(double raduis, String color, Boolean isFilled) {
        this.raduis = raduis;
        this.color = color;
        this.isFilled = isFilled;
    }
    @Override
    double getArea() {
        return Math.pow(raduis, 2)*Math.PI;
    }

    @Override
    String getColor() {
        return this.color;
    }

    @Override
    Boolean isFilled() {
        return this.isFilled;
    }

    @Override
    void show() {
        System.out.println("Area = "+getArea());
        System.out.println("Color = "+getColor());
        System.out.println("isFilled "+ isFilled());
    }
    
}
