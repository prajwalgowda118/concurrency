package Threads;

public class EvenThread implements Runnable {

    @Override
    public void run() {

        for(int i=0;i<=10;i+=2){
            System.out.println("Even thread "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}