package level2;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

class output {
public static void main(String[]args){

        System.out.println(GenericUtils.generateOperationId());
        System.out.println(GenericUtils.currentTime());
        }
}

class GenericUtils {

        private static SecureRandom generator = new SecureRandom();

        /**
         * Provides a random operation id
         *
         * @return int with the operation id
         */
        public static int generateOperationId() {
                return generator.nextInt();
        }

        /**
         * Provides the current time in string format (YYYY-MM-dd HH:mm:ss)
         *
         * @return String with the current time
         */
        public static String currentTime() {
                Date d = Date.from(Instant.now());
                SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.S000");
                f.setTimeZone(TimeZone.getTimeZone("UTC"));
                return f.format(d);
        }

}

