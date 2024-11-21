package Two;

public class Shape {
    private String color;
    public Shape(String color){
        this.color = color;
    }

    public String hello(){
        return "Shape color = "+color;
    }
    public double getArea(){
        System.out.println("Shape is unknown");
        return 0;
    }

}
