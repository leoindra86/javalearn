public class toString {
        //ref for more - https://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java

        public static void main(String[] args) {

                Employee emp = new Employee("Martinez", "Anthony");
                System.out.println(emp.toString());

                Pet p = new Pet("Jane",10);
                //Calling the class version of toString()
                System.out.println(p.toString());
                //Calling the original toString()
                System.out.println(Integer.toString(12));

        }
}

class Employee {
        private String lastName;
        private String firstName;

        public Employee(String lastName, String firstName) {
                this.lastName = lastName;
                this.firstName = firstName;
        }
//        public String toString() {
//                return "Employee[" + this.firstName + " " + this.lastName + "]";
//
//        }
        public String toString() {
                return this.getClass().getName() + "["+ this.firstName + " " + this.lastName + "]";
        }
}

class Pet{
        String name;
        Integer age;

        Pet(String n, Integer a){
                this.name=n;
                this.age=a;
        }
        //Over-riding the toString() function as a class function
        public String toString(){
                return "The name of the pet is " + this.name + ". The age of the pet is " + this.age;
        }
}









