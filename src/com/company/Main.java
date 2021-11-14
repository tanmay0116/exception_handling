package com.company;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements in the array : ");
      try{
          for(int i=0;i<num;i++){
              String tt = s.next();
              arr[i] = Integer.parseInt(tt);}
              System.out.println("Enter the index of the array element you want to access : ");
              int ind = s.nextInt();
              try{
                  System.out.println("The array element at index "+ind+" = "+arr[ind]);
              }
              catch(IndexOutOfBoundsException e){
                  System.out.println(e);
              }

      }
        catch(NumberFormatException e){
               System.out.println(e);
           }

    }
}