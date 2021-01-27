/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_1;

/**
 *
 * @author Kritsanaphat
 */
public class Stock {
    String symbol = "ORCL";
    String name = "Oracle Coperation";
    double previousClosingPrice = 34.5;
    double currentPrice = 34.35;
    
    Stock(String newSym , String newName) {
      
        symbol = newSym;
        name  = newName;
    }

    double getChangePercent(){
        return ((currentPrice-previousClosingPrice)*100)/previousClosingPrice;
    }
  
}
