/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

import java.util.ArrayList;



/**
 *
 * @author krit
 */
public class LAB6_3 {
    public static void main(String[] args) {
       Queue q = new Queue();
       addArray(7,q,0);
       q.Showdata();
        System.out.println("Siz of array = "+ q.getSize());
        System.out.println("Siz of data = "+ q.getSizeofindex());
        System.out.println("------------------------------------");
        addArray(30,q,7);
       q.Showdata();
        System.out.println("Siz of array = "+ q.getSize());
        System.out.println("Siz of data = "+ q.getSizeofindex());
        System.out.println("------------------------------------");
        addArray(500,q,30);
       q.Showdata();
        System.out.println("Siz of array = "+ q.getSize());
        System.out.println("Siz of data = "+ q.getSizeofindex());
        System.out.println("------------------------------------");
        
         q.dequeue();
         q.Showdata();
         System.out.println("Siz of array = "+ q.getSize());
         System.out.println("Siz of data = "+ q.getSizeofindex());
          System.out.println("------------------------------------");
         
         q.empty();
         q.Showdata();
         System.out.println("Siz of array = "+ q.getSize());
         System.out.println("Siz of data = "+ q.getSizeofindex());
          System.out.println("------------------------------------");


}
    public static void addArray(int x,Queue q,int last) {
        for(int i=last+1;i<=x;i++){
        q.enqueue(i);
        }
    }
  
    }