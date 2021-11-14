package com.company;

public class MathOperation {
    public static void main(String[] args) {
        int arr[] = new int[5],tot=0;
        try{
            for(int i=0;i<args.length;i++){
                arr[i] = Integer.parseInt(args[i]);
                tot=tot+arr[i];
            }
            System.out.println("Total of the entered values : "+tot);
            System.out.println("Average of the entered numbers is : "+tot/(args.length));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
