public class Truck extends Car{
    int weight;


    Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public   double getSalePrice(){
        if (weight>2000){
            regularPrice = regularPrice - regularPrice*0.1;
        }else {
            regularPrice = regularPrice - regularPrice*0.2;
        }
        return regularPrice;
    }
}
