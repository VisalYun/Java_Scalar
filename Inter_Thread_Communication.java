package Semester_Preparation;

class customer{
    int amount = 1000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<amount){
            System.out.println("Your balance is: "+this.amount);
            System.out.println("less balance; waiting to deposit");
            try{
                wait();
            }catch (Exception e){}
            this.amount-=amount;
            System.out.println("withdraw completed");
            System.out.println("Your remaining balance: "+this.amount);
        }
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        this.amount+=amount;
        System.out.println("deposit completed");
        System.out.println("Your balance now: "+this.amount);
        notify();
    }
}
class t1 extends Thread{
    customer c;
    t1(customer c){
        this.c = c;
    }
    public void run(){
        c.withdraw(1500);
    }
}
class t2 extends Thread{
    customer c;
    t2(customer c){
        this.c = c;
    }
    public void run(){
        c.deposit(1000);
    }
}
public class Inter_Thread_Communication {
    public static void main(String[] args) {
        customer c = new customer();
        t1 th1 = new t1(c);
        th1.start();
        t2 th2 = new t2(c);
        th2.start();
    }
}

