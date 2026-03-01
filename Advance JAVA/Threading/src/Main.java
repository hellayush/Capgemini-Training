class child extends Thread{

    public void run()
    {
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("childee" + i);
        }
    }
}
class child2 implements Runnable
{
    public void run()
    {
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("child" + i);
        }
    }
}
class Main
{
    static void main() {
        Thread thread = Thread.currentThread();
        System.out.println(" ->" + thread );
        child t  = new child();
        child2 t2 = new child2();

        t.start();
        Thread t1 = new Thread(t2);
        t1.start();
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("main" + i);
        }
    }
}