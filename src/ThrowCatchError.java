import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThrowCatchError{

                public static void main(String[] args)  {
                        method1();

                }
        //throws FileNotFoundException has to dealt with as - throws FileNotFoundException unless its dealt in try catch block
        //without try catch -- put throws FileNotFoundException in every declaration line ex - method1() throws FileNotFoundException
        //Check link - https://www.youtube.com/watch?v=8khFCNyxyzI
                static void method1() {
                        method2();

                }

                static void method2() {

                        Scanner scan = null;
                        try {
                                scan = new Scanner(new FileReader("Test.txt"));
                                System.out.println(scan.nextLine() );

                        }
                        catch  (FileNotFoundException e) {
                                System.out.println("File not found");;
                        }

                        finally {
                                //System.out.println("File Not found");
                                try {
                                        if (scan != null) {
                                                scan.close();
                                                }
                                } catch (Exception e) {
                                        System.out.println("Scan is null and catch block executed"); //to have this - scan == null in try block
                                }
                                finally
                                {
                                        System.out.println("finally method");
                                }

                        }
                }

}





