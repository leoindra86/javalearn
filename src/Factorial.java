import java.util.Scanner;

public class Factorial {

        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter factorial number :");
                int n1 = input.nextInt();
                System.out.println(factorial(n1));

        }

         static int factorial(int n) {
                if (n == 1) {
                        System.out.println("Factorial of Num " + n + " is " + n);
                        return 1;
                } else {
                        int k = n * factorial(n -1);
                        System.out.println("Factorial of Num " + n + " is " + k);
                        //return n * factorial(n -1);
                        return k ;
                }

        }
}
