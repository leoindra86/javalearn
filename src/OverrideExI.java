class method {
public static void main(String[]args){
        Bbbb bb = new Bbbb();
        bb.a(); // Without Static method
        Bbbb.b(); //With Static method
        System.out.println(bb.getClass());
        System.out.println(new Bbbb().a()); //Bbbb is subclass inheriting from class test

        }
}


class test {
        public boolean a() {
                System.out.println("This is Class A");
                return false;
        }
}


class Bbbb extends test {
        //@Override  // --- Add override -- error method does not override method from its superclass
        public boolean a() {
                System.out.println("Without Static -- This is class B");
                return true;
        }
        public static void b() {
                System.out.println("With Static This is Class B");
        }
}
