public class ExceptionHandlingII {
        public static void main(String[] args)
        {
                try
                {
                        int[] a = null ; // remove null or {3} to null to catch NullPointerException
                        System.out.println(a[1]);
                }
                catch (NullPointerException e) {
                        System.out.println(e);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                }
                catch (Exception e ) {
                        System.out.println(e);
                }
        }
}
