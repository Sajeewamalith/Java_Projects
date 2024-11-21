package Two;

public class Rectangle extends Shape{
    private int lenght;
    private int width;

    public Rectangle(String color,int length,int width){
        super(color);
        this.lenght=length;
        this.width=width;
    }

    public String hello(){
        return "rectangle length= "+lenght+" and width= "+width+"subclass of "+super.hello();
    }
    public double getArea(){
        return lenght*width;
    }
}
