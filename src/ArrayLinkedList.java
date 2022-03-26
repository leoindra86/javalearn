import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedList {

        public static void main(String[] args)
        {
               //a - list no of contents, b - get number in between
                logic(1000000, 5000);
        }

        static void logic ( long a, long b) {

                ArrayList<Integer> arrayList = new ArrayList<>();
                LinkedList<Integer> linkedList = new LinkedList<>();
                List<Integer> listmethod = new ArrayList<>();


                for (int i = 0; i <= a; i ++) {
                        arrayList.add(i);
                        listmethod.add(i);
                        linkedList.add(i);
                }

                final long startTimeAA = System.nanoTime();
                arrayList.get((int) b);
                final long endTimeAA = System.nanoTime();

                final long startTimeli = System.nanoTime();
                listmethod.get((int) b);
                final long endTimeli = System.nanoTime();


                final long startTimeLL = System.nanoTime();
                linkedList.get((int) b);
                final long endTimeLL = System.nanoTime();


                long totalTimeAA = endTimeAA - startTimeAA;
                long totalTimeli = endTimeli - startTimeli;
                long totalTimeLL = endTimeLL - startTimeLL;

                System.out.println("Total ArrayList execution time: " + totalTimeAA);
                System.out.println("Total List-Method execution time: " + totalTimeli);
                System.out.println("Total LinkedList execution time: " + totalTimeLL);


}
}


