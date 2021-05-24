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
public class Triangle extends GeometricObject implements Cloneable{
    
     double x,y,z;
    private String Color;
    private double weight;
   String name;

      public Triangle(String name , double x, double y, double z, String Color, double weight) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.Color = Color;
        this.weight = weight;
        this.name=name;
    }

       public Triangle() {
    }
       

    
    @Override
    double getArea() {
        double s=(x+y+z)/2;
        return  s* Math.sqrt((s-x)*(s-y)*(s-z));
    }

   @Override
    protected Object clone() throws CloneNotSupportedException {
       Triangle clone = (Triangle) super.clone();
        return clone;
    }

    public Boolean equals(Triangle a) {
       if(x !=a .x)return false;
       else if(y != a.y) return false;
       else return z == a.z;

    }
  


    @Override
    String getName() {
        return name;
    }
    
}
