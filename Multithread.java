package Semester_Preparation;

class Odd extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            if(i%2!=0){
                System.out.println(i);
                try{
                    Thread.sleep(1);
                } catch ( Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class Even extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            if(i%2==0) {
                System.out.println(i);
                try {
                    Thread.sleep(2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        Odd o = new Odd();
        Even ev = new Even();
        o.start();
        ev.start();
    }
}
