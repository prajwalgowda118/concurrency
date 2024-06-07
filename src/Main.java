import Threads.CustomThread;
import Threads.EvenThread;
import Threads.OddThreads;

public class Main {


    public static void main(String[] args)

    {

       /* String str=Thread.currentThread().getStackTrace()[1].getMethodName();

        System.out.println(str);

        CustomThread thread=new CustomThread();
        thread.start();*/

        OddThreads oddThreads = new OddThreads();

        Thread t1 = new Thread(new EvenThread());

        oddThreads.start();
        t1.start();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}