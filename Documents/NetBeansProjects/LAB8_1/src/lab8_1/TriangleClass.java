/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_1;

/**
 *
 * @author Kritsanaphat
 */
public class TriangleClass extends GeometricClass {
 private double x,y,z;
    private String Color;
    private Boolean Value;

    public TriangleClass(double x, double y, double z, String Color, Boolean Value) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.Color = Color;
        this.Value = Value;
    }
    @Override
    double getArea(double x,double y,double z) {
     double s=(x+y+z)/2;
        return  s* Math.sqrt((s-x)*(s-y)*(s-z));

    }

    @Override
    void show() {
        System.out.println("Area = "+getArea(x,y,z));
        System.out.println("Color = "+getColor(Color));
        System.out.println("is Filled = "+isFilled(Value));
    }

    @Override
    String getColor(String Color) {
        return this.Color;
    }

    @Override
    Boolean isFilled(Boolean isFilled) {
        return this.Value;
    }
    
     }
