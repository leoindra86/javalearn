package level2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

        private static final String FILENAME = "C:\\Users\\einddut\\IdeaProjects\\javalearn\\src\\level2\\test.txt";

        public static void main(String[] args) {

                try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

                        String strCurrentLine;
                        while ((strCurrentLine = br.readLine()) != null) {
                                System.out.println(strCurrentLine);
                        }

                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}