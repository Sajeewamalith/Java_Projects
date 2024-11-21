public class ChickenBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        System.out.println("Chicken Burger Order...");
        return new ChickenBurger();
    }
}
