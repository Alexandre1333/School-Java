public class Pets {
    private static int totalPets = 0;
    private String name;

    public Pets(String name) {
        this.name = name;
        totalPets++;
    }

    public static int getTotalPets() {
        return totalPets;
    }
    public String getName() {
        return name;
    }
}

