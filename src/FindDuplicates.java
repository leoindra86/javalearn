//https://www.youtube.com/watch?v=tqI18_X_uoc&list=PL59LTecnGM1MMSBPiLN4aMwM7DcnVld0s&index=7

import java.util.Scanner;

public class FindDuplicates {

        public static void main(String[] args) {

               /* //For Testing - hardcode string
                String sentence = "How many duplicates are there?";
                System.out.println(sentence);
                System.out.println(sentence.charAt(0));*/

                System.out.println("Enter anything: ");
                Scanner input = new Scanner(System.in);
                String n1 = input.next();

                String characters = "";
                String duplicates = "";

            /*    // Printing vertically each word
                for (int i = 0; i < sentence.length(); i++) {
                        System.out.println(sentence.charAt(i));
                }

                // Printing horizontally
                for (int i = 0; i < sentence.length(); i++) {
                        characters += sentence.charAt(i);
                        System.out.println(characters);

                }*/

                // Printing horizontally
                for (int i = 0; i < n1.length(); i++) {

                       String current = Character.toString(n1.charAt(i));
                       if (characters.contains(current)) {
                               if (!duplicates.contains(current)) {
                                       duplicates += current;// + "-";
                               }
                       }
                        characters += current;
                }
                System.out.println(duplicates);

        }

}
