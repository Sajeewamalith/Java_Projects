public class Main {
    public static void main(String[] args) {

        System.out.println("*** Welcome Burger Restaurant ***");

        Restaurant chickenBurgerOrder = new ChickenBurgerRestaurant();
        chickenBurgerOrder.orderBurger();

        System.out.println("==========================");

        Restaurant vegetableBurgerOrder = new VegetableBurgerRestaurant();
        vegetableBurgerOrder.orderBurger();

    }
}