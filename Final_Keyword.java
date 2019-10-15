package Semester_Preparation;

public class Final_Keyword {
    public static void main(String[] args) {
        //final variable
        final int a  = 10;
            //if(a==10) a++;
        //error due to final can't be reinitiallize
        System.out.println(a);

        demo d = new demo();
        d.print();
        d.finalPrint();
    }
}

class Contain_Final_Method{
    void print(){
        System.out.println("Not final method...");
    }
    //final method
    final void finalPrint(){
        System.out.println("Final method");
    }
}

//final class
final class demo extends Contain_Final_Method{
        /*@Override
        void finalPrint(){
            System.out.println("Not Final method");
        }*/
    //error, due to final method can't be override
}

    //class demo2 extends demo{}
//error, due to final class can't be inherit
