public class GenericsM<T, V> { // Integer, or Parameter Type - are pushed by T and V

        T object;
        V object2;

        GenericsM(T object, V object2) { //constructor
                this.object = object;
                this.object2 = object2;
        }

         void ShowType() {
                System.out.println(object.getClass().getName());
                System.out.println(object2.getClass().getName());
        }

}

//another class

class NumericFns<T extends Number> {

        T num;

        NumericFns(T obj) {
                this.num = obj;
        }

        double square() {
                return num.doubleValue() * num.doubleValue(); //square wont take string .. force method square to accept int and double type
        }

        boolean absEqual(NumericFns<T> obj) { //obj is passed in
                if (Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue()))
                        //absolute value of num.doublevalue equals obj passes in num - doublevalue
                        return true;
                return false;
        }

        boolean wildCard(NumericFns<?> obj) { // ? to pass in Integer or Double from same declaration
                if (Math.abs(num.doubleValue()) == Math.abs(obj.num.doubleValue()))
                        //absolute value of num.doublevalue equals obj passes in num - doublevalue
                        return true;
                return false;
        }

}
