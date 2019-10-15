package Semester_Preparation;

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try{
            int ans = a/b;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        finally {
            System.out.println("End of program!");
        }
    }
}
