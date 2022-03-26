import java.util.Locale;

public class MethodChaining {

        public static void main(String[] args)
        {
                String name = "    bro";

                //One Way
//                name = name.concat(" code    ");
//                name = name.toUpperCase();
//                name = name.trim();

                //Another way --method chained in one line ------
                name = name.concat(" code   ").toUpperCase().trim();

                System.out.println(name);
        }
}
