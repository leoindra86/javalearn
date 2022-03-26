
public class InterfaceExIII {
        public void greet(Greeting greeting) {
                greeting.perform();
        }


        public static void main(String[] args)
        {
                InterfaceExIII greeter = new InterfaceExIII();
                HelloWorld helloWorld = new HelloWorld();

                greeter.greet(helloWorld); //implements below logic Greeting helloWorld - helloWorld.perform()
                helloWorld.perform();

                //lambda expression of type greeting expression, implementing the interface, by the function
                Greeting myLambdaFunction = () -> System.out.println("Lambda function called by Interface Greeting");
                myLambdaFunction.perform();

                //created a new class, that implemented greeting interface, provided the logic in the class
                Greeting myHelloWorld = new HelloWorld();
                myHelloWorld.perform();


        }

}

/*
public class HelloWorld implements Greeting
{
        @Override public void perform()
        {
                System.out.println("hello World");
        }
}

public interface Greeting
{
        public void perform();
}
*/
