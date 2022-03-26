import java.awt.Point;

public class Constructor {
        public static void main(String[] args)
        {
                Circle c1 = new Circle();
                System.out.println( c1.center );
                System.out.println( c1.radius );

                Circle c2 = new Circle( new Point(3, 1), 2);
                System.out.println(c2.center);
                System.out.println(c2.radius);


        }
}

//Constructor -- must have same name as the class, Constructor of circle class will be circle, string class will be string
//Constructor are called by new operator
class Circle {
        Point center;
        double radius;

        Circle() {
                center = new Point(0, 0);
                radius = 1;
        }

        Circle(Point initialCenter, double initialRadius) {
                center = initialCenter;
                radius = initialRadius;
        }
}
