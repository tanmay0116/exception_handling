package com.company;

//import javax.naming.directory.InvalidSearchControlsException;

class InvalidCountryException extends Exception{
    InvalidCountryException(String s){
        super(s);
    }
}
public class UserRegistration {
    public static void registerUser(String username, String userCountry) throws InvalidCountryException {
        if(userCountry!= "India"){
            throw new InvalidCountryException("User Outside India cannot be registered.");}
            else
            System.out.println("User registration done successfully");
        }

    public static void main(String[] args) {
        try{
        registerUser("Micky","India");}
        catch(InvalidCountryException e){
            System.out.println(e);
        }
    }
    }

