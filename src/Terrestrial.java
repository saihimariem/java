class Terrestrial implements Omnivore<Food> {
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("L'animal terrestre mange de la viande");
        } else {
            System.out.println("L'animal terrestre ne mange pas " + meat);
        }
    }