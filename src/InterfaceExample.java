//abstract and interface -watch https://www.youtube.com/watch?v=52frlN8webg
//stackoverflow - https://stackoverflow.com/questions/1321122/what-is-an-interface-in-java

//Interface assumes all are abstract, all list, no implemented method
//while abstract class -  can be list of methods, lists, implemented methods and abstract both.

interface WaterBottleInterface {
        String color = "Blue";

        void fillUp();
        //void pourOut();
}


//implements -- implementing the methods from the interface
//extends -- adding on to previously implemented methods

public class InterfaceExample implements WaterBottleInterface {

        public static void main(String[] args)
        {
                System.out.println(color);
                InterfaceExample ex = new InterfaceExample();
                ex.fillUp();


        }

        @Override
        public void fillUp() {
                System.out.println("It is filled");

        }

}

