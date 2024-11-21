public class MyAutoShop {
    public static void main(String[] args) {
      Sedan sedan = new Sedan(200,2000000,"Red",35);
      System.out.println(sedan.getSalePrice());
      Car car = new Car(200,2000000,"Red");
      System.out.println(car.getSalePrice());

    }
}