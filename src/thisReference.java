
public class thisReference {

        public void doProcess(int i, Process p) {
                p.process(i);
        }

        public static void main(String[] args) {

                thisReference thisref = new thisReference();
                thisref.doProcess(10, new Process() {

                        @Override
                        public void process(int i) {
                                System.out.println("Value of i is " + i);
                                System.out.println(this); // ref to toString -- anonymous inner class

                        }

                        public String toString() {
                                return this.getClass().getName() + " - called by toString method from the inner class";
                        }
                });



/*  Replaced with Lambda Process ---
                doProcess(a, new Process() {
                        @Override
                        public void process(int i) {
                                System.out.println(i + b);
                        }
                        });*/

                //doProcess(a, k -> System.out.println(k + b)); // passed to doProcess to execute

        }
}
