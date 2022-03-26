public class ExceptionHandlingIII {
        public static void main(String[] args)
        {
                int[] a = new int[]{ 0, 4, 5, 9 };
                try {
                        double result = intDivide( 18, a[2]); //Increase the array [0] number to 4
                        System.out.println(result);
                }

                catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                }
                catch (Exception e ) {
                        System.out.println(e);
                }
        }

        public static double intDivide(int i, int j) {
                return (double)i / j;
        }
}
