public class GetAndSet {
        public static void main(String[] args)
        {
                GetAndSetFile Bob = new GetAndSetFile();
                //setting the values
                Bob.setName("Bob");
                Bob.setAge(22);
                Bob.setFavColor("Blue");

                //getting the values
                System.out.println("My name is " + Bob.getName() + " and color is " + Bob.getFavColor());

        }
}
