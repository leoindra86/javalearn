public class ReturnStatements {
        public static void main(String[] args)
        {
                printAMessage();
                add(4, 5);
                int sum = returnAdd(4, 5);
                System.out.println("this is returning from method returnAdd " + sum);

                String shouting = caps("in uppercase this message by return method");
                System.out.println(shouting);

        }

        public static void printAMessage()
        {
                System.out.println("This is not return statement, its output");
        }

        public static void add(int a, int b)
        {
                System.out.println("Printing out numbers from instance" + " " + a + " and " + b); // this is generating output, not returning
        }

        public static int returnAdd(int a, int b) //Check void is removed to return
        {
                return a + b;
        }

        public static String caps(String s) //Check void is removed to return
        {
                return s.toUpperCase();
        }
}
