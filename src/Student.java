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
