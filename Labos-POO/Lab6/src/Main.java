public class Main {
    public static void main(String[] args) {
        BurgerBuilder builder = Kitchen.getInstance();
        BurgerDirector director = new BurgerDirector(builder);


        Burger chickenBurger = director.makeChickenBurger();
        System.out.println("***************************\n");
        System.out.println("HAMBURGUESA DE POLLO CON LECHUGA Y TOMATE" + chickenBurger);

        Burger beefBurgerWithoutLettuce = director.makeBeefBurgerWithoutLettuce();
        System.out.println("***************************\n");
        System.out.println("HAMBURGUESA CON TODOS LOS INGREDIENTES MENOS LECHUGA Y CARNE DE RES" + beefBurgerWithoutLettuce);

        Burger beefBurgerWithAllIngredients = director.makeBeefBurgerWithAllIngredients();
        System.out.println("***************************\n");
        System.out.println("HAMBURGUESA CON TODOS LOS INGREDIENTES Y DE TOCINO" + beefBurgerWithAllIngredients);
    }
}
