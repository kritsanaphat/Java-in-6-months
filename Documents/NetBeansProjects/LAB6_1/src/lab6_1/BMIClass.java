/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_1;

/**
 *
 * @author Kritsanaphat
 */
public class BMIClass {
   private String name;
   private int age;
   private double weight;
   private double feet;
   private double inches;
   private double BMI;
   
   BMIClass(int age , String name,double weight ,double feet ,double inches){
       this.age =age;
       this.name=name;
       this.weight=weight;
       this.feet=feet;
       this.inches=inches;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }
   
   
   public double bmicalculator(double weight,double feet,double inches){
       BMI=(weight*0.4535937)/(((feet*0.3048)+(inches*0.0254))*((feet*0.3048)+(inches*0.0254)));
       return BMI;
   }
   
   public String Interpretation(double weight,double feet,double inches){
       BMI=(weight*0.4535937)/(((feet*0.3048)+(inches*0.0254))*((feet*0.3048)+(inches*0.0254)));
       if(BMI<18.5){
           System.out.println("Unterweight");
       }
       else if(BMI>=18.5 && BMI<=25){
            System.out.println("Normal");
       }
       else if(BMI>=25.0 && BMI<=30){
            System.out.println("Overweight");
       }
       else if(BMI>=30){
            System.out.println("Obese");
       }
       return null;
   }
}
