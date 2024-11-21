public class Rectangle extends Square{

    Rectangle(){
        System.out.println("Rectangle");
    }


    public double RectangelArea() {
        return super.squareArea();
    }

    @Override
    public double squarePerimeter() {
        return super.squarePerimeter();
    }
}
