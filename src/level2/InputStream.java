package level2;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

class InputStream {

        public static void main(String[] args)
        {
                inputStream();
        }

        public static void inputStream() {

                // Creates an array of character
                char[] array = new char[100];
                String filesss = "C:/Users/einddut/IdeaProjects/javalearn/src/level2/test.txt";
                try {
                        // Creates a FileInputStream
                        FileInputStream file = new FileInputStream(filesss);

                        // Creates an InputStreamReader -- InputStreamReader will read the characters from the input stream file
                        InputStreamReader input = new InputStreamReader(file, Charset.forName("UTF8"));

                        // Reads characters from the file
                        input.read(array);
                        System.out.println("InputStreamReader in the stream:");
                        System.out.println(array);

                        // Closes the reader
                        input.close();
                }

                catch(Exception e) {
                        e.getStackTrace();
                }
        }
}