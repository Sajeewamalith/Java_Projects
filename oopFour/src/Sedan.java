public class Sedan extends Car{

    int length;

    Sedan(int speed, double regularPrice, String color,int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }


    public   double getSalePrice(){
        if (length>20){
            regularPrice = regularPrice - regularPrice*0.05;
        }else {
            regularPrice = regularPrice - regularPrice*0.1;
        }
        return regularPrice;
    }
}
