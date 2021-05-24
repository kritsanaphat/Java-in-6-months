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
public class Triangle extends Geometric{
private double x,y,z;
    private String Color;
    private Boolean Value;

    public Triangle(double x, double y, double z, String Color, Boolean Value) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.Color = Color;
        this.Value = Value;
    }
    @Override
    double getArea() {
        double s=(x+y+z)/2;
        return  s* Math.sqrt((s-x)*(s-y)*(s-z));
    }

    @Override
    String getColor() {
        return this.Color;
    }

    @Override
    Boolean isFilled() {
        return this.Value;
    }

    @Override
    void show() {
         System.out.println("Area = "+getArea());
        System.out.println("Color = "+getColor());
        System.out.println("is Filled = "+isFilled());
    }

    
}
