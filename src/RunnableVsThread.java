////Implement Runnable Interface...

/*
https://stackoverflow.com/questions/541487/implements-runnable-vs-extends-thread-in-java
Runnable interface approach, only one instance of a class is being created and it has been shared by different threads.
        So the value of counter is incremented for each and every thread access.

        Whereas, Thread class approach, you must have to create separate instance for every thread access. Hence different memory is allocated for every class instances and each has separate counter,
        the value remains same, which means no increment will happen because none of the object reference is same.*/

class RunnableEx1 implements Runnable {

        private int counter = 0;
        public void run() {
                counter++;
                System.out.println("ImplementsRunnable : Counter : " + counter);
        }
}


//Extend Thread class...
class ExtendsThread extends Thread {

        private int counter = 0;

        public void run() {
                counter++;
                System.out.println("ExtendsThread : Counter : " + counter);
        }
}

//Use the above classes here in main to understand the differences more clearly...
public class RunnableVsThread {

        public static void main(String args[]) throws Exception {

                // Multiple threads share the same object.
                RunnableEx1 rc = new RunnableEx1();
                Thread t1 = new Thread(rc);
                t1.start();
                Thread.sleep(1000); // Waiting for 1 second before starting next thread
                Thread t2 = new Thread(rc);
                t2.start();
                Thread.sleep(1000); // Waiting for 1 second before starting next thread
                Thread t3 = new Thread(rc);
                t3.start();

                // Creating new instance for every thread access.
                ExtendsThread tc1 = new ExtendsThread();
                tc1.start();
                Thread.sleep(1000); // Waiting for 1 second before starting next thread
                ExtendsThread tc2 = new ExtendsThread();
                tc2.start();
                Thread.sleep(1000); // Waiting for 1 second before starting next thread
                ExtendsThread tc3 = new ExtendsThread();
                tc3.start();
        }
}

