enum Level {
        LOW, MEDIUM, HIGH; //enums has to be in caps
}

//enum - enumerated ordered listing of items in a collection, grouping of constants that behave similarly like objects
enum Planet {
        MERCURY(1),
        VENUS(2),
        EARTH(3),
        MARS(4),
        JUPITER(5),
        SATURN(6),
        URANUS(7),
        NEPTUNE(8),
        PLUTO(9);

        int num;

        Planet(int num) {
                this.num = num;
        }



}

public class LetsDoEnums{

        public static void main(String[] args)
        {
                //One way
                Level l = Level.LOW;
                System.out.println("Print enum from object " + l);
                System.out.println("Print enum direct " + Level.MEDIUM);
                System.out.println("");

                //Another way
                Planet myPlanet = Planet.PLUTO;
                canILiveHere(myPlanet);
        }

        static void canILiveHere(Planet planetobj) {
                switch (planetobj) {
                        case EARTH:
                                System.out.println(Planet.EARTH + " is livable" + " planet number is " + planetobj.num);
                                break;
                        default: //for others
                                System.out.println(planetobj + " not livable, planet number is " + planetobj.num);
                                break;
                }
         }

}
