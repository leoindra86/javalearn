public class Generics2 {

        public static void main(String[] args)
        {
                Integer[] intArray = {1, 2, 3, 4, 5};
                Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
                Character[] charArray = {'H', 'E', 'L', 'O', 'P'};
                String[] stringArray = {"B","Y","T","E"};

//                displayArray(intArray);
//                displayArray(doubleArray);
//                displayArray(charArray);
//                displayArray(stringArray);

                System.out.println(getFirst(intArray));
                System.out.println(getFirst(doubleArray));
                System.out.println(getFirst(charArray));
                System.out.println(getFirst(stringArray));
        }



        public static <T> void displayArray(T[] array) { //generics to put all type of arrays in method

                for(T x : array) {
                        System.out.println(x+ " ");
                }
        }

        //method generic
        public static <T> T getFirst(T[] array) { //first t - type generic and 2nd t - return generic, pass in array of generics
                return array[0];
        }
}
