public abstract class User implements Talk //abstract cannot be instantiated
{
        public String firstName;
        public String lastName;

        public Boolean verified = false;

        public void sayHello()
        {

                System.out.println("User Class Method");
        }
}
