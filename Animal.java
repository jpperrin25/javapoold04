
public class Animal {

    protected enum Type {
        MAMMAL,
        FISH,
        BIRD
    }

    private String name;
    private int legs;
    private Type type;

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;

        numberOfAnimals++;

        switch (type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }

        System.out.println("My name is " + name + " and I am a " + getType() + "!");
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type.toString().toLowerCase();
    }

    public static int getNumberOfAnimals() {
        displayCount(numberOfAnimals, "animal");
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        displayCount(numberOfMammals, "mammal");
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        displayCount(numberOfFish, "fish");
        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        displayCount(numberOfBirds, "bird");
        return numberOfBirds;
    }

    
private static void displayCount(int count, String type) {
    String verb = (count == 1) ? "is" : "are";
    String noun = type;

    if (count != 1 && !type.equals("fish")) {
        noun = type + "s";
    }

    System.out.println("There " + verb + " currently " + count
            + " " + noun + " in our world.");
}

}
