class ResourceTest {
        static void sound(String s) {
                String fileName = s;
                System.out.println(fileName);
                System.out.println(new ResourceTest().getClass().getResource(fileName)); // Only work when file present
                System.out.println(new ResourceTest().getClass().getClassLoader().getResource(fileName)); //Only work when file present
        }

        public static void main(String[] args)
        {
                ResourceTest.sound("test.txt");
        }
}
