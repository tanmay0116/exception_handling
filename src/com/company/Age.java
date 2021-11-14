package com.company;
class InvalideAge extends Exception{
    public InvalideAge(String s){
        super(s);
    }
}
public class Age{
    public static void checker(String s,int age) throws InvalideAge{
        if(age<18 || age>=60)
            throw new InvalideAge("Age you entered is not valid");
        else
            System.out.println("Your entered details\nName: "+s+" \nage:"+age);
    }

    public static void main(String[] args) {
        String s = args[0];
        int age = Integer.parseInt(args[1]);
        try{
        checker(s,age);}
        catch(InvalideAge e){
            System.out.print("Exception occurs : "+e);
        }

    }
}