public class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed,double regularPrice,String color){
        this.color = color;
        this.regularPrice = regularPrice;
        this.speed = speed;
    }



    public   double getSalePrice(){
        return regularPrice;
    }
}
