public enum Food {
    MEAT,
    PLANT,
    BOTH;
}

interface Carnivore<T extends Food> {
    void eatMeat(T meat);
}


interface Herbivore<T extends Food> {
    void eatPlant(T plant);
}

interface Omnivore<T extends Food> extends Carnivore<T>, Herbivore<T> {
    void eatPlantAndMeat(T food);
}

class Aquatic implements Carnivore<Food> {
    // ... (méthodes eatMeat déjà définies)
}


class Terrestrial implements Omnivore<Food> {
    // ... (méthodes eatMeat, eatPlant et eatPlantAndMeat déjà définies)
}


class Penguin extends Terrestrial implements Omnivore<Food> {
    @Override
    public void eatPlant(Food plant) {
        System.out.println("Le pingouin ne mange généralement pas de plantes");
    }
}
