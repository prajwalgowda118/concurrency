import Threads.CustomThread;

public class Main {


    public static void main(String[] args)

    {

        String str=Thread.currentThread().getStackTrace()[1].getMethodName();

        System.out.println(str);

        CustomThread thread=new CustomThread();
        thread.start();

    }
}