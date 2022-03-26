import level2.Person;

import java.util.Arrays;
import java.util.List;

public class ForEachLambda {

                public static void main(String[] args) { //accessing the same getters and setters from level2.Person

                        List<Person> people = Arrays.asList(
                                new Person("Charles", "Dickens", 60),
                                new Person("Matthew", "Arnold", 39));

                        System.out.println("Using normal for i in each loop-array.size " + people.size());

                        for(int i = 0; i < people.size(); i++) {
                                System.out.println(people.get(i));
                        }

                        System.out.println("");
                        System.out.println("Using for Person p : people loop way");

                        for (Person p : people) {
                                System.out.println(p);
                        }

                        System.out.println("");
                        System.out.println("Using Lambda way for each loop");

                        people.forEach(p -> System.out.println(p));
                        //difference between above loop and this --

                        //no order, no instruction to execute the list, not sequential

                        System.out.println("");
                        System.out.println("Using Method reference way loop");

                        people.forEach(System.out::println);
                        //no order, no instruction to execute the list, not sequential


                }
}

