public class override
{
         public static void main(String args[])
         {
                 new Child().displayMessage(); //new --- child or Parent are classes not method, so call new to use them
                 //new Parent().displayMessage(); //hased both parent and grandparent to run super
                 //new GrandParent().displayMessage();

         }
}

class Child extends Parent {

        @Override // Test - hash override and delete some words from displaymessage, it will run parent class.
        void displayMessage() {
                super.displayMessage(); // runs the superclass, class that is extended
                System.out.println("Invoking the method from the Child class.");
        }
}

class Parent extends GrandParent {
        @Override
        void displayMessage() {
                System.out.println("Invoking the method from the Parent class.");
        }
}

class GrandParent {
        void displayMessage() {
                System.out.println("Invoking the method from the Grandparent class.");
        }
}



