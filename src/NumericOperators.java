public class NumericOperators {
    public static void main(String[] args) {
        System.out.println("First line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");



        //public static void main(String[] args) {
            int valA = 21;
            int valB = 6;
            int valC = 3;
            int valD = 1;

            int result1 = valA - valB / valC; //Check the difference
            int result2 = (valA - valB) / valC; //check the difference
            int result3 = valA / valC * valD + valB;
            //check the difference, div and mul have same preference, happens from left to right
            int result4 = valA / (valC * ( valD + valB)); //check the difference

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);



            //public static void main(String[] args) {
                float floatVal = 1.0f;
                double doubleVal = 4.0d;
                byte byteVal = 7;
                short shortVal = 7;
                long longVal = 5;

                /*
                Important Conversion Notes ----


                short result5 = byteVal;
                //Conversion of byteVal, short is larger than byte
                short result6 = (short) longVal;
                //conversion of long to short, long is larger than short, forced the long to short
                short result7 = (short) (byteVal - longVal);
                //calculation is long, converted to short, assigned to short.
                float result8 = longVal - floatVal;
                //long is interger type, float has decimal, result8 to float


                 */



                System.out.println("Success");
        }

        }


