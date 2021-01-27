/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_1;

/**
 *
 * @author Kritsanaphat
 */
public class Lab3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LINE = 10;
        final int NUMBER=100;
        int count=0;
        int num=2;
        
        while(count<NUMBER){
            boolean prime= true;
            
            for(int i=2;i<=num/2;i++){              //chkprimenumber
                if(num %i==0){
                    prime = false;
                    break;
                }
                
                if(num>=10  && num<=99){               //palindromic 10
                    if(num%10 != num/10){
                        prime=false;
                        break;
                    }
                }
                
                  if(num>=100  && num<=999){               //palindromic 100
                    if(num/100 != (num%100)%10){
                        prime=false;
                        break;
                    }
                }
                  
                  if(num>=1000  && num<=9999){               //palindromic 1000
                 
                        prime=false;
                        break;
                }
                  
                    if(num>=10000  && num<=99999){               //palindromic 10000
                       if(num/10000 != (((num%10000)%1000)%100)%10){
                          prime=false;
                        break;
                        }      
                       if((num%10000)/1000 != (((num%10000)%1000)%100)/10){
                          prime=false;
                           break;
                        }
                       }
                    
            }
            
            if(prime){
                count++;
                
                if(count%LINE==0){
                    System.out.println(num);
                }
                else System.out.print(num+" ");
            }
            
            num++;
            }
    }
    
}
