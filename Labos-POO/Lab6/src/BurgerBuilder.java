public interface BurgerBuilder {
    BurgerBuilder addChicken();
    BurgerBuilder addBeef();
    BurgerBuilder addLettuce();
    BurgerBuilder addTomato();
    BurgerBuilder addOnion();
    BurgerBuilder addCheese();
    BurgerBuilder addBacon();
    Burger build();
}
