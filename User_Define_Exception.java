package Semester_Preparation;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

public class User_Define_Exception {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int age = s.nextInt();
        try{
            validate(age);
        }catch(Exception m){System.out.println("Exception occured: "+m);}
        System.out.println("rest of the code...");
    }

    static void validate(int age) throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    //throws use for declaring exception
    //throw use for throwing exception
}
