public class BurgerDirector {
    private BurgerBuilder builder;

    public BurgerDirector(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger makeChickenBurger() {
        return builder.addChicken().addLettuce().addTomato().build();
    }

    public Burger makeBeefBurgerWithAllIngredients() {
        return builder.addBeef().addTomato().addOnion().addCheese().addBacon().build();
    }

    public Burger makeBeefBurgerWithoutLettuce() {
        return builder.addBeef().addTomato().addCheese().addOnion().addBacon().build();
    }
}
