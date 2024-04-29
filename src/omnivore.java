 interface Omnivore<T> extends Carnivore<T>, herbivore<T> {
    void eatPlantAndMeat(T food);
}

