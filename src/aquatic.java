
 class Aquantic extends Animal implements Carnivore<Food> {
    private String habitat;
    Aquatic (String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    String getHabitat() {
        return habitat;
    }

    void setHabitat(String habitat) {
        this.habitat = habitat;
    }
     void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
   String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}
