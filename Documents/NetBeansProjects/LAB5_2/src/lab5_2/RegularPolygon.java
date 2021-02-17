/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;

/**
 *
 * @author Kritsanaphat
 */
public class RegularPolygon {

    private double defines =3;
    private double side =1;
    private double x=0;
    private double y=0;
    RegularPolygon(){
        
    }
    
    
    public double getdefines() {
    return defines;
  }   
    public void setdefines(double setdefines) {
        int newdefines = 3;
        this.defines = newdefines;
  }
      public double getdeside() {
    return side;
  }
    public void setside(double setside) {
        double newside = 1;
        this.side = newside;
  }
      public double getx() {
    return x;
  }
    public void setx(double x) {
        double newx = 0;
        this.defines = newx;
  }
      public double gety() {
    return y;
  }
    public void sety(double y) {
        double newy = 0;
        this.y = newy;
  }
    
    
    
    public double RegularPolygon2(double defines1,double side1){
        defines= defines1;
        side=side1;
        return 0;
    }
    public int RegularPolygon3(int defines,int side){
        
        return 0;
        
    }
    public  double getPerimeter(double defines,double side){
       return defines*side;
    }
    public  double getArea(double defines,double side){
       return (defines*(side*side)/4*Math.tan(Math.PI/defines));
    }

  
    
}
