public class GenericsMain {

        public static void main(String[] args)
        {
                GenericsM<Integer, Integer> obj = new GenericsM<>(10, 20); //Cannot be primitive in Generics<Integer>
                GenericsM<Double, Double> obj2 = new GenericsM<>(20.0, 30.0);

                obj.ShowType();
                obj2.ShowType();

                //Integer or Double declare, work individually --
                NumericFns<Integer> obj3 = new NumericFns<Integer>(6);
                NumericFns<Double> obj4 = new NumericFns<Double>(-6.0);


                //obj3.absEqual(obj4); //-- Unhash to see -- Integer type wont accept Double, because obj3 passing in Integer
                System.out.println("Integer type to Integer type --boolean ans -- " + obj3.absEqual(obj3));


                //By wild card -- this dependency is removed -
                System.out.println("Double type inside Integer type --boolean ans --" + obj3.wildCard(obj4));


                System.out.println(obj3.square());
                //System.out.println(obj4.square());
        }
}

