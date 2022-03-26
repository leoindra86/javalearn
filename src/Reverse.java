import java.util.Scanner;

public class Reverse {

        public static void main(String[] args) {
                implemnt();
        }
        //Input // Output method
        static String implemnt() {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter anything :");
                String n1 = input.next();
                String n2 = Reverse.reverse(n1);
                System.out.println(n2);
                return n2;

        }
        //Reverse Logic
         static String reverse (String s) {
                char[] letters = new char[s.length()]; //char type ---- reads the characters
                                                        // from the input and stores in the specified array

                int letterIndex = 0;
                for(int i = s.length() -1; i >=0; i--) {
                        letters[letterIndex] = s.charAt(i); //reverse char stored in letters
                        //System.out.println(s.charAt(i));
                        letterIndex ++;
                }
                String reverse = "";
                for(int i = 0; i < s.length(); i++) { // i < cz - array starts from 0, hence never reach to lastnumber - s.length()
                        reverse = reverse + letters[i];
                }

                return reverse;
        }
}

