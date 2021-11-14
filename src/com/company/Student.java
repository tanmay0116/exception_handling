package com.company;
import java.util.*;
class NegativeValueException extends Exception{
    NegativeValueException(String s){
        super(s);
    }
}
public class Student {
    int m1,m2,m3;
    String name;
    public static void check(String name,int m1,int m2,int m3) throws NegativeValueException{
        if((m1>=0 && m1<=100) && (m2>=0 && m2<=100) && (m3>=0 && m3<=100)){
            System.out.println("The average marks of "+name+" are : "+(m1+m2+m3)/3);
        }
        else
        {
            throw new NegativeValueException("Entered value is invalid!");
        }
    }
    Student(String name, String m1,String m2,String m3){
        this.name=name;
        this.m1=Integer.parseInt(m1);
        this.m2=Integer.parseInt(m2);
        this.m3=Integer.parseInt(m3);
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        try{
            System.out.println("Enter the details of first student : ");
     Student obj1 = new Student(ss.next(), ss.next(), ss.next(),ss.next());
            System.out.println("Enter the details of the second student : ");
     Student obj2 = new Student(ss.next(),ss.next(),ss.next(),ss.next());
        check(obj1.name, obj1.m1, obj1.m2,obj1.m3);
        check(obj2.name,obj2.m1,obj2.m2,obj2.m3);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(NegativeValueException e){
            System.out.println(e);
        }
    }
}
