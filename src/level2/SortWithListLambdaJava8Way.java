package level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SortWithListLambdaJava8Way {

        public static void main(String[] args) //accessing the same getters and setters
        {
                List<Person> people = Arrays.asList(
                        new Person("Charles", "Dickens", 60),
                        new Person("Lewis", "Caroll", 42),
                        new Person("Thomas", "Caryle", 51),
                        new Person("Charlotte", "Bronte", 45),
                        new Person("Matthew", "Arnold", 39));

                //sort list by last name by lambda --check SortWithList for without lambda implmn
                Collections.sort(people, (Person p1, Person p2) -> p1.getLastname().compareTo(p2.getLastname())); //Person can be removed, kept for references

                //printAll -- method moved to lambda -- condition printAll(List<Person> people) not required
                printCondition(people, p ->  true, p -> System.out.println(p)); //Creates lambda expr -- condition below for all true, output of p - true -- resulting all output

                System.out.println("Normal Starts with Way Method : List people with last name beginning with C");
                //method to get people with last name beginning with C
                //printLastNameBeginingWithC(people);


                System.out.println("lambda Method : Print only Firstname");
                //printCondition method as same above - method here what needs to be done on condition
                printCondition(people, p -> p.getLastname().startsWith("C"), p -> System.out.println(p.getFirstname())); //returns boolean passes to below condition
        }


        //printCondition method -- pass the condition from printCondition(people, new Condition() --- and print the result
        private static void printCondition(List<Person> people1, Predicate<Person> predicate, Consumer<Person> consumer) {
                                                //Predicate<Person> --- interface, return boolean
                                                //Consumer behaviour --- to pass the lambda, for operation to perform cleared by Predicate
                                                //Consumer executing the lambda system out print
                for (Person p : people1) {
                        if (predicate.test(p)) {
                                consumer.accept(p);
                        }
                }
        }

}
