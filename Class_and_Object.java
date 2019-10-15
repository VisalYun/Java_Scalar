package Semester_Preparation;

class MyInfo{
    String name = "Name";
    void printName(){
        System.out.println("My name is "+name);
    }
}

public class Class_and_Object {
    public static void main(String[] args) {
        MyInfo visal = new MyInfo();
        visal.name = "Visal";
        visal.printName();
    }
}
