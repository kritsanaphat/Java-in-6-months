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
public class rectangles extends Geometric{
    private double side1,side2;
    private String Color;
    private Boolean isFilled;

    public rectangles(double side1, double side2, String Color, Boolean isFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.Color = Color;
        this.isFilled = isFilled;
    }
    
    @Override
    double getArea() {
        return this.side1*this.side2;
    }

    @Override
    String getColor() {
        return this.Color;
    }

    @Override
    Boolean isFilled() {
       return this.isFilled;
    }

    @Override
    void show() {
        System.out.println("Area = "+getArea());
        System.out.println("Color = "+getColor());
        System.out.println("isFilled "+isFilled);
    }

    
    
}
