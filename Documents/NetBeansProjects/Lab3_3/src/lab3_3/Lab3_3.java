/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_3;

import java.util.Scanner;

/**
 *
 * @author Kritsanaphat
 */
public class Lab3_3 {

    
    public static void main(String[] args) {
        System.out.print("Enter the size for matrix :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int line = num;
        int count = 0;
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = (int) (0 + Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
        testrow(matrix, num);
        testcolum(matrix, num);
        testsuperdiagonal(matrix, num);
        testdiagonal(matrix, num);
        testsubdiagonal(matrix, num);
    }

    public static int testrow(int[][] matrix, int num) {
        int cont = 0;
        int[] x = new int[5];
        int[] y = new int[5];
        int[] wrong = new int[5];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (matrix[i][j] != matrix[i][j + 1]) {
                    wrong[i] = 2;
                } else {
                    x[i] = matrix[i][j];
                    y[i] = i;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            if (wrong[i] == 2) {
                cont++;
            } else {
                System.out.println("All " + x[i] + "s on row " + y[i]);
            }
        }
        if (cont == 4) {
            System.out.println("No same numbers on a row");
        }

        return 0;

    }

    public static int testcolum(int[][] matrix, int num) {
        int cont = 0;
        int[] x = new int[5];
        int[] y = new int[5];
        int[] wrong = new int[5];
        for (int j = 0; j < num; j++) {
            for (int i = 0; i < num - 1; i++) {
                if (matrix[i][j] != matrix[i + 1][j]) {
                    wrong[j] = 2;
                } else {
                    x[j] = matrix[i][j];
                    y[j] = j;
                }
            }
        }
        for (int j = 0; j < num; j++) {
            if (wrong[j] == 2) {
                cont++;
            } else {
                System.out.println("All " + x[j] + "s on colum " + y[j]);
            }
        }
        if (cont == 4) {
            System.out.println("No same numbers on a colum");
        }

        return 0;

    }

    public static int testsuperdiagonal(int[][] matrix, int num) {
        int correct = 0;
        int x = 0;
        for (int i = 0; i < num-1; i++) {
            if (matrix[i][i+1] == 1) {
                correct++;
                x = matrix[i][i+1];
            } else if (matrix[i][i+1] == 0) {
                correct = correct + 10;
                x = matrix[i][i+1];
            }
        }
        if (correct == num-1 || correct == ((num-1) * 10)) {
            System.out.println("All " + x + "s on the superdiagonal");
        } else {
            System.out.println("No same numbers on the superdiagnal");
        }
        return 0;

    }

    public static int testdiagonal(int[][] matrix, int num) {
        int correct = 0;
        int x = 0;
        for (int i = 0; i < num; i++) {
            if (matrix[i][i] == 1) {
                correct++;
                x = matrix[i][i];
            } else if (matrix[i][i] == 0) {
                correct = correct + 10;
                x = matrix[i][i];
            }
        }
        if (correct == num || correct == (num * 10)) {
            System.out.println("All " + x + "s on the diagonal");
        } else {
            System.out.println("No same numbers on the diagnal");
        }
        return 0;

    }
    
     public static int testsubdiagonal(int[][] matrix, int num) {
        int correct = 0;
        int x = 0;
        for (int i = 0; i < num-1; i++) {
            if (matrix[i+1][i] == 1) {
                correct++;
                x = matrix[i+1][i];
            } else if (matrix[i+1][i] == 0) {
                correct = correct + 10;
                x = matrix[i+1][i];
            }
        }
        if (correct == num-1 || correct == ((num-1) * 10)) {
            System.out.println("All " + x + "s on the subdiagonal");
        } else {
            System.out.println("No same numbers on the subdiagnal");
        }
        return 0;

    }

}
