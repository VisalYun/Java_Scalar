package Semester_Preparation.Set;
import java.util.*;

class TreeSet1{
    public static void main(String args[]){
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ravi");
//        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
