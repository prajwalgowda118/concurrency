package Threads;

public class CustomThread extends Thread {

    @Override
    public void run() {

            for(int i=1;i<=10;i++){

                System.out.println("1");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

}
