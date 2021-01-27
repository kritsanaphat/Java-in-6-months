/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab3_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        String str1 = input.nextLine();
        System.out.print("Enter list2: ");
        String str2 = input.nextLine();
        
        int[] list1 = convertToArrayInt(str1);
        int[] list2 = convertToArrayInt(str2);
        int[] mergeList = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int i = 0; i < mergeList.length; i++) {
            System.out.print(mergeList[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] numMerge = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, numMerge, 0, list1.length);
        System.arraycopy(list2, 0, numMerge, list1.length, list2.length);
        java.util.Arrays.sort(numMerge);
        return numMerge;
    }

    public static int[] convertToArrayInt(String str) {
        int space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {                //find number of array
                space++;
              
            }
        }
        int[] newList = new int[space + 1];            //made array
        
        String strNum = "";
        int j = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length()) {
                newList[j] = Integer.parseInt(strNum);
                break;
            } else {
                if (str.charAt(i) == ' ') {
                    newList[j] = Integer.parseInt(strNum);
                    j++;
                    strNum = "";
                } else {
                    strNum += str.charAt(i);
                }
            }
        }
        return newList;
    }
}