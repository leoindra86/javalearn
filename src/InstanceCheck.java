
class Bird{
        public void sing(){
                System.out.println("Bird class sing");
        }
}
class Eagle extends Bird{
}

public class InstanceCheck{
        public static void main(String[] args)
        {
                InstanceCheck cc = new InstanceCheck();
                Eagle ee = new Eagle();
                System.out.println(cc instanceof InstanceCheck);
                //cc is instance of Class InstanceCheck Class
                System.out.println(ee instanceof Bird);
                //Eagle class is subclass of SuperClass Bird
        }
}
