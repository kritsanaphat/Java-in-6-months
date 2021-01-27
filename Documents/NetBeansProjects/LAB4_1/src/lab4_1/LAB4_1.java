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
public class LAB4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
       

        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: " + stock.name);
        System.out.println("Previous Closing Price: " + stock.previousClosingPrice);
        System.out.println("Current Price: " + stock.currentPrice);
        System.out.printf("Price-change: " + stock.getChangePercent()+ "%%");
    }

}
