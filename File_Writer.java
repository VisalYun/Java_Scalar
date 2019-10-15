package Semester_Preparation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Writer {
    public static void main(String[] args) {
        try {
            FileWriter myObj = new FileWriter("src/Semester_Preparation/exampleFileWriter.txt");
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            myObj.append(str);
            myObj.close();
            System.out.println("Writing complete.");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
