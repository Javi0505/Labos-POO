public class Burger {
    private Burger(){}
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean cheese;
    private boolean bacon;

    public Burger(String meat) {
        this.meat = meat;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    @Override
    public String toString() {
        return "\n" +
                "Carne:" + meat + "\n" +
                "Lechuga: " + lettuce + "\n" +
                "Tomate: " + tomato + "\n" +
                "Cebolla: " + onion + "\n" +
                "Queso: " + cheese + "\n" +
                "Tocino: " + bacon + "\n";
    }
}
