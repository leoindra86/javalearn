import java.util.Scanner;

public class ExceptionHandling {

        public static void main(String[] args)
        {
                int x = 1; //Program running over again and again.. unless while loop moves to 2
                Scanner input = new Scanner(System.in);
                do
                {

                        try
                        {
                                System.out.println("Enter first number: ");
                                int n1 = input.nextInt();

                                System.out.println("Enter second number: ");
                                int n2 = input.nextInt();
                                int div = n1 / n2;
                                System.out.println("Division result is " + div);
                                x = 2; // it will come here only division is success...
                        }
                        catch (Exception e)
                        { //catching the error
                                System.out.println(e);
                        }

                }while
                        (x == 1); // continue running the program unless division is success


        }
}
