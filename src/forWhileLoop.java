import java.util.ArrayList;

public class forWhileLoop {

        public static void main(String[] args)
        {

                for(int i =0; i < 5; i++) {
                System.out.println("for loop at time " + (i));
                }

                String[] cars = {"car1", "car2", "car3", "car4"}; //1D array to for loop on loop length
                for(int i =0; i < cars.length; i++) {
                        System.out.println("loop car " + cars[i]);
                }
                for(String car : cars) {
                        System.out.println("for each loop car : " + car );
                }

                //Printing the array and while loop ones
                forWhileLoop arry = new forWhileLoop();
                arry.array();

                whlle.whle(); //access directly as its static class


        }
        //array can hold primitive - int, long, boolean or String -object,
        //arraylist can hold only objects,no primitives directly, for ex - int is Integer (wrapper class)
        public void array() {

                ArrayList<Integer> numbers = new ArrayList<Integer>();

                numbers.add(2);
                numbers.add(4);
                numbers.add(4);
                numbers.add(5);
                numbers.add(9);

                for (int a : numbers)
                {
                        System.out.println(a);
                }

                for (int i = 0; i < numbers.size(); i++)
                {
                        System.out.println("numbers are " + numbers.get(i));
                }
        }

 static class whlle {

        public static void whle() {

            int a = 0;
            while (a < 5) {
                    System.out.println("while loop for a is " + a);
                    ++a;
            }

        }
}
}






