
public class LambdaClosure {

        public static void main(String[] args) {
                int a = 10;
                int b = 30;

/*  Replaced with Lambda Process ---
                doProcess(a, new Process() {
                        @Override
                        public void process(int i) {
                                System.out.println(i + b);
                        }
                        });*/

                doProcess(a, k -> System.out.println(k + b)); // passed to doProcess to execute

        }

        public static void doProcess(int i, Process p) {
                p.process(i);
        }
}

interface Process {
        void process(int i);
}
