package Semester_Preparation;

abstract class Animal{
    void drink(){
        System.out.println("Drinking Water...");
    }
    abstract void eat();
}

class Tiger extends Animal{
    @Override
    void eat() {
        System.out.println("Eating Meat...");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.drink();
        t.eat();
    }
}
