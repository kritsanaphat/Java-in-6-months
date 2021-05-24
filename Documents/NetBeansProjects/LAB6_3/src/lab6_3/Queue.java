/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_3;

import java.util.Arrays;

/**
 *
 * @author krit
 */
public class Queue {
     int[] elements;
     int sizeofindex;
     int defalut=8;
    
    Queue(){
      this.sizeofindex=0;
      elements = new int[defalut];
    }
    
   public int getSize() {
        return elements.length;
    }
    
    public int getSizeofindex() {
        return this.sizeofindex;
    }
    public int getData(int sizeofarray) {
        return this.elements[sizeofarray];
    }
     public void enqueue(int v) {
       ExpandArray(sizeofindex+1);
       elements[sizeofindex]= v;
       sizeofindex++;
    }
    
    public void Showdata(){
        System.out.print("[");
        for(int i=0;i<this.sizeofindex;i++){
            System.out.print(this.getData(i)+" ");
        }
        System.out.println("]");
    }
    

    public  void dequeue() {
        dequeue(0);
    }
    public void dequeue(int index_remove) {
      
       if(this.elements == null){
           return;
       }
      
        int[] newelements = new int[elements.length - 1]; 
 
        for (int i = 0, k = 0; i < elements.length; i++) { 
            if (i == index_remove) { 
                continue; 
            } 
            newelements[k++] = elements[i]; 
        } 
        this.elements = newelements;
        this.sizeofindex--;
        if(this.sizeofindex < 0) this.sizeofindex =0;

    }
    
    public  int emptyCHK() {
        int chk=0;
      if(this.elements == null || this.getSize()==0){
          return chk=1;
      }
      else return chk=0;
    }
    
    public  void empty() {
      while(this.emptyCHK()==0){
          this.dequeue(0);
      }
    }
    
    
    public void ExpandArray(int v) {
       while(defalut<v){
           defalut = defalut*2;
            
        }
       elements= Arrays.copyOf(elements, defalut); 
  
    }
}