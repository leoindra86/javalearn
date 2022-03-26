public class nullPointer {  /// Class is written below for null return

        //https://www.softwaretestinghelp.com/nullpointerexception-in-java/

        public static nullPointer initT() {     //method returns a null object
                return null;

        }

        public void print(String s) {
                System.out.println(s.toLowerCase());
        }
}
class runIt {
        public static void main(String[] args) {
                nullPointer t = nullPointer.initT();    //new object and of return null and pass return null with print method
                t.print("Hello, World!");       //invoke  method using null object
        }
}