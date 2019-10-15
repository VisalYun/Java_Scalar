package Semester_Preparation;

class Student{
    String name;
    int Id;
    Student(){
        System.out.println("Student created...");
    }

    Student(String name, int Id){
        //this to point out class constructor
        this();
        //this tho point out class instance variable
        this.name = name;
        this.Id = Id;
        //this to invoke current class method
        this.print();
    }

    void print(){
        System.out.println(this.name + ":" + this.Id);
    }
}

public class This_Keyword {
    public static void main(String[] args) {
        Student visal = new Student("Visal",1101801078);
    }
}
