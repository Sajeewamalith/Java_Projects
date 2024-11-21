public class Rectangle {

    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        int setArea = length*breadth;
        return setArea;
    }

    public int perimeter(){
        int setPerimeter = (length+breadth)*2;
        return setPerimeter;
    }
}
