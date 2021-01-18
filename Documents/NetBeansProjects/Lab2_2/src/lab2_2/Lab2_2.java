/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class Lab2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("scissor (0) , rock (1) , paper (2) : ");
        Scanner user1 = new Scanner(System.in);
        int user = user1.nextInt();
        int com = (int) (Math.random() * 3);
        if (user == 0) {
            if (com == 0) {
                System.out.println("The computer is scissor. You is scissor. You draw");
            } else if (com == 1) {
                System.out.println("The computer is paper. You is scissor. You won");
            } else {
                System.out.println("The computer is rock. You is scissor. You loses");
            }
        } else if (user == 2) {
            if (com == 0) {
                System.out.println("The computer is scissor. You is paper. You loses");
            } else if (com == 1) {
                System.out.println("The computer is paper. You is paper. You draw");
            } else {
                System.out.println("The computer is rock. You is paper. You won");
            }
        } else if (user == 1) {
            if (com == 0) {
                System.out.println("The computer is scissor. You is rock. You won");
            } else if (com == 1) {
                System.out.println("The computer is paper. You is rock. You loses");
            } else {
                System.out.println("The computer is rock. You is rock. You draw");
            }
        }
    }

}
