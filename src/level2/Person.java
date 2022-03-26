package level2;

public class Person {
        private String firstname;
        private String lastname;
        private int age;

        public Person (String firstname, String lastname, int age) {
                super();
                this.firstname = firstname;
                this.lastname = lastname;
                this.age = age;
        }

        public String getFirstname() {
                return firstname;
        }

        public void setFirstname(String firstname)
        {
                this.firstname = firstname;
        }

        public String getLastname()
        {
                return lastname;
        }

        public void setLastname(String lastname)
        {
                this.lastname = lastname;
        }

        public int getAge()
        {
                return age;
        }

        public void setAge(int age)
        {
                this.age = age;
        }

        //Called by printall method --toString sending the format of output --- change toString name and see the result
        public String toString() {
                return "Person [firstName=" + firstname + ", + lastName=" + lastname + ", age=" + age + "]";
        }
}
