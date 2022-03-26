public class LambdaInterfaceAndThread {

        public static void main(String[] args) {
                StringLength mylambda = (String s) -> s.length(); //lambda expr - find out length of the string from given String s
                System.out.println(mylambda.getLength("Hello Lambda"));

                printLambda(l -> l.length()); //Using Lambda for StringLength method to print

                Thread myLambdaThread = new Thread(() -> System.out.println("Printing inside lambda Runnable"));
                myLambdaThread.run(); // Run called from Thread class
        }


        public static void printLambda(StringLength k) {
                System.out.println(k.getLength("Hello printLambda"));
        }


        interface StringLength {
                int getLength(String s);
        }

}