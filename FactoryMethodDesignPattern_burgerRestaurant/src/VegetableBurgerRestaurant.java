public class VegetableBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        System.out.println("Vegetable Burger Order...");
        return new VegetableBurger();
    }
}
