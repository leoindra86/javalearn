import java.util.ArrayList;
import java.util.List;

public class InterfaceExII {

        public static void main(String[] args)
        {
                //one way of passing variables
                Student s = new Student("test", "too");
                s.sayHello();

                //another way -
                //Talk implementedByUser = new User(); --- remove abstract from user.class to test this method
                //implementedByUser.sayHello();

                /*
                Since it implements Talk, an Object of Class User is both an instance of User and an instance of Talk.
                This allows, to declare a variable of type Talk and assign it an implementation of one implementing class.
                 */

        }
}

/* -- all dependent method classes

Teacher.java
public class Teacher extends User implements Talk
{
        @Override
        public void sayHello()
        {

                System.out.println("Teacher method implemented");
        }
}

Student.java
public class Student extends User implements Talk {
        //public Boolean verified = TRUE;
        public String major;

        public Student(String fn, String ln) {
                firstName = fn;
                lastName = ln;
        }

        @Override
        public void sayHello() {
                super.sayHello();
                System.out.println("hi my major is " + major + " my name is" + firstName + " " + lastName);
        }
}


User.java
public abstract class User implements Talk
{
        public String firstName;
        public String lastName;

        public Boolean verified = false;

        public void sayHello()
        {

                System.out.println("User Method");
        }
}

Interface
public interface Talk
{
        void sayHello();
}



 */
