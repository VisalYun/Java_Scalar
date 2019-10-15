package Semester_Preparation;

interface animal{
    void eat();
}

interface mamals{
    void feedingbaby();
}

class Cat implements animal, mamals{
    @Override
    public void eat() {
        System.out.println("Eating fish...");
    }

    @Override
    public void feedingbaby() {
        System.out.println("Breasting milk...");
    }
}

public class Interface {
    public static void main(String[] args) {
            //Animal a = new Animal();
        //error, because interface contain only abstract method where is need to be implemented
        Cat c = new Cat();
        c.eat();
        c.feedingbaby();
    }
}
