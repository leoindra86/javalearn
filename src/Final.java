public class Final{
         final int Max;
        //final int Max = 5; //same as below Final () constructor
        final int Min = 0;
        static final double PI = 3.14159;
        //Constructor one way
        Final() {
                Max = 5;
        }
        //void changeMax(int newMax) {
        //        Max = newMax;// won't accept, if final int max; in line 2
        //}
        public void sayHi(){
                System.out.println("hi");
        }
        public static void main(String[] args)
        {
                Final f = new Final();
                System.out.println(f.Max);
                f.sayHi();
                OtherClass.sayHello();
        }
}
class OtherClass extends Final{ //comment in line1 as final public class Final --- final wont extend
        public static void sayHello(){
                System.out.println("OtherClass saysHello");
        }
}