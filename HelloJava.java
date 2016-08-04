import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloJava {
    public static class Hellos implements Runnable {
        public void run() {
            for (int i = 1; i <= 1000; ++i)
                System.out.println("Hello " + i);
        }
        public Hellos(){};
    }


    public static class Goodbyes implements Runnable {
        public void run() {
            for (int i = 1; i <= 1000; ++i)
                System.out.println("Goodbye " + i);
        }
        public Goodbyes(){};
    }
    public static void main(String[] args) {
        System.out.println("Hello world");

        //initialization for runnable instances
        Goodbyes goodbyes = new Goodbyes();
        Hellos hellos = new Hellos();

        //Instance of threads' operator
        Executor executor = Executors.newCachedThreadPool();
        
        //Process the run() method, no value returned
        executor.execute(goodbyes);
        executor.execute(hellos);
    }
}
