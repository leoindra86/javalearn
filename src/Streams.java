import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

        public static void main(String[] args) {


                List<Person> people = new ArrayList<>();

                people.add(new Person("Alex Barksdale", 120));
                people.add(new Person("Bodie Poot", 80));
                people.add(new Person("Peanut Butter", 180));
                people.add(new Person("Peanut Butter", 150));
                people.add(new Person("Bubbles Bell", 200));

                List<Person> hundredClub = new ArrayList<>();
                for (Person p : people) { //Check and return person having billions more than 100
                        if(p.billions >= 100) {
                                hundredClub.add(p);
                        }
                }
                //Stream to filter --- person -- loop through each person, person.billions(on what filter on)
                List<Person> hundredClub2 = people.stream()
                        .filter(person -> person.billions >= 100)
                        .collect(Collectors.toList()); //collect(Collectors.toList()) --- return as list

                //Stream to sort ---
                List<Person> hundredClub3 = people.stream()
                        .sorted(Comparator.comparing(person -> person.name))
                        .collect(Collectors.toList()); //collect(Collectors.toList()) --- return as list


                hundredClub.forEach(person -> System.out.println(person.name)); //for loop way to filter
                System.out.println(" ");

                hundredClub2.forEach(person -> System.out.println(person.name)); //Stream and lambda function
                System.out.println(" ");

                hundredClub3.forEach(person -> System.out.println(person.name)); //Stream and lambda function

        }

        static class Person {
                String name;
                int billions;


        public Person(String name, int billions) {
                this.name = name;
                this.billions = billions;
        }


}
}
