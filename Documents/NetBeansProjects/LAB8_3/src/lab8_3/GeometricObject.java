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
public abstract class GeometricObject implements Comparable<GeometricObject> {

    String Color;
    double weight;

    public GeometricObject(String Color, double weight) {
        this.Color = Color;
        this.weight = weight;
    }
    
    public GeometricObject() {
    }

    public String getColor() {
        return Color;
    }
   
    
    
    abstract double getArea();
    abstract String getName();
    
    
    
    public static String max(GeometricObject a, GeometricObject b){
        if (a.compareTo(b) == 1) {
            return a.getName();
        } else if (a.compareTo(b) == -1) {
            return b.getName();
        } else if (a.compareTo(b) == 0){
            return "EQUAL";
        }
        else 
            return "Value is incorrect";
    }

    
    @Override
    public  int compareTo(GeometricObject o){
         if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else if (getArea() == o.getArea()){
            return 0;
        }
        else return 2;
    }
    
}
