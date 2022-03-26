package level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortWithList {

        public static void main(String[] args) //accessing the same getters and setters
        {
                List<Person> people = Arrays.asList(
                        new Person("Charles", "Dickens", 60),
                        new Person("Lewis", "Caroll", 42),
                        new Person("Thomas", "Caryle", 51),
                        new Person("Charlotte", "Bronte", 45),
                        new Person("Matthew", "Arnold", 39));

                //sort list by last name
                Collections.sort(people, new Comparator<Person>() {

                        @Override //compare method for above comparator Person
                        public int compare(Person o1, Person o2) {
                                return o1.getLastname().compareTo(o2.getLastname());
                        }
                        });

                printAll(people);
                System.out.println("Normal Starts with Way Method : List people with last name begining with C");


                //method to get people with last name begining with C
                printLastNameBeginingWithC(people);
                System.out.println("Condition Method : List people with last name begining with C");


                //printCondition method as same above - method here what needs to be done on condition
                printCondition(people, new Condition1() { ///  I can create another same printCondition method based on firstname
                        @Override                       // and pass on to below printCondition to generate output
                        public boolean test(Person p) {
                                return p.getLastname().startsWith("C");
                        }
                });
        }

        //printall method
        private static void printAll(List<Person> people) {
                for (Person p : people) {
                        System.out.println(p); //p.toString() called automatically
                }
        }

        //printLastNameBeginingWithC method -- lastname condition and print the output
        private static void printLastNameBeginingWithC(List<Person> people) {
                for (Person p : people) {
                        if (p.getLastname().startsWith("C")) {
                                System.out.println(p);
                        }
                }
        }


        //printCondition method -- pass the condition from printCondition(people, new Condition() --- and print the result
        private static void printCondition(List<Person> people, Condition1 condition) {
                for (Person p : people) {
                        if (condition.test(p)) {
                                System.out.println(p);
                        }
                }
        }

}

interface Condition1 {
         boolean test(Person p);
}
