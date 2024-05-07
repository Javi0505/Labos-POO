public class Kitchen implements BurgerBuilder {
    private static Kitchen instance;
    private Burger burger;

    public static BurgerBuilder getInstance() {
        if (instance == null) {
            instance = new Kitchen();
        }
        return instance;
    }

    public Kitchen() {
        this.burger = new Burger("");
    }

    @Override
    public BurgerBuilder addChicken() {
        burger = new Burger("Pollo");
        return this;
    }

    @Override
    public BurgerBuilder addBeef() {
        burger = new Burger("Carne");
        return this;
    }

    @Override
    public BurgerBuilder addLettuce() {
        burger.setLettuce(true);
        return this;
    }

    @Override
    public BurgerBuilder addTomato() {
        burger.setTomato(true);
        return this;
    }

    @Override
    public BurgerBuilder addOnion() {
        burger.setOnion(true);
        return this;
    }

    @Override
    public BurgerBuilder addCheese() {
        burger.setCheese(true);
        return this;
    }

    @Override
    public BurgerBuilder addBacon() {
        burger.setBacon(true);
        return this;
    }

    @Override
    public Burger build() {
        return burger;
    }


}
