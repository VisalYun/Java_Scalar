package Semester_Preparation;

class parentClass{
    parentClass(){
        System.out.println("Parent class created");
    }
    String className = "Parents";
    void print(){
        System.out.println("I am Parent class!!!");
    }
}

class childClass extends parentClass{
    childClass(){
        //super to call super class constructor
        super();
        System.out.println("Child class created");
    }
    String className = "Child";
    @Override
    void print(){
        //super method
        super.print();
        System.out.println(className);
        System.out.println(super.className); //super with instance variable
    }
}

public class Super_Keyword extends parentClass {
    public static void main(String[] args) {
        childClass c = new childClass();
        c.print();
    }
}
