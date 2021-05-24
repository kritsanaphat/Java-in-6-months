/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_3;

/**
 *
 * @author Kritsanaphat
 */
public class Cricle extends GeometricObject implements  Cloneable{
    private double radius;
    private double weight;
    private String Color;
    String name;  

    public Cricle(String name, double radius, String Color , double weight) {
        this.radius = radius;
        this.weight = weight;
        this.Color = Color;
        this.name = name;
    }

       
    @Override
    double getArea() {
       return Math.PI*Math.pow(radius, 2);
    }



    @Override
    String getName() {
        return name;
    }





    @Override
    protected Object clone() throws CloneNotSupportedException {
       Cricle clone = (Cricle) super.clone();
        return clone;
    }

    public Boolean equals(Cricle x) {
       return radius == x.radius;

    }
    
    
    
}
