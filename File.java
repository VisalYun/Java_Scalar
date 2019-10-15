package Semester_Preparation;

import java.io.*;

public class File {
    public static void main(String[] args) {
        try {
            java.io.File myObj = new java.io.File("src/Semester_Preparation/exampleFile.txt");
            if(myObj.createNewFile()){
                System.out.println("File created: "+ myObj.getName());
            }
            else {
                System.out.println("File is already exist.");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

