public class RunnableAndThread {

        public static void main(String[] args)
        {
                //Runnnable method, thread class
                Thread mythread = new Thread(new java.lang.Runnable()
                {
                        @Override public void run()
                        {
                                System.out.println("Printing runnable Inside");
                        }
                });

                mythread.run();

                //Lambda method
                Thread myLambdaThread = new Thread(() -> System.out.println("Printing inside Lambda Runnable"));
                myLambdaThread.run();
        }
}
