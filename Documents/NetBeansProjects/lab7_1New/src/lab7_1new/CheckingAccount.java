/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_1new;

/**
 *
 * @author Kritsanaphat
 */
public class CheckingAccount extends Account{
    private double limit;
    private double withdraw;

    public CheckingAccount() {
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    public void chkover(double limit,double withdraw,double balance){
        if(limit+balance<withdraw){
            System.out.println("ERROR");
        }
        else System.out.println("Balance is "+(balance-withdraw));
    }

    @Override
    public String toString() {
        return super.toString()+"CheckingAccount{" + "limit=" + limit + ", withdraw=" + withdraw + '}';
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    
    
}
