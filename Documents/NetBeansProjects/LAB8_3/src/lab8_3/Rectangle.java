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
 public class Rectangle extends GeometricObject implements Cloneable{
    private double width;
    private double height;
    private String Color;
    private double weight;
      String name;  

    public Rectangle(String name,double width, double height, String Color, double weight) {
        this.width = width;
        this.height = height;
        this.Color = Color;
        this.weight = weight;
        this.name=name;
    }
      

  
    @Override
    double getArea() {
        return width*height;
    }

    public Rectangle() {
    }

    
      public Boolean equals(Rectangle x) {
        if(width != x.width) return false;
        else return height == x.height;

    }    

    @Override
    String getName() {
       return name;
    }
    
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
      Rectangle clone = (Rectangle) super.clone();
        return clone;
    }
    }

  
