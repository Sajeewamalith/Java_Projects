public class Main {
    public static void main(String[] args) {

        Room room = new Room();
        room.setData(7,"bed 3","2 nd floor");
        room.displayData();

        System.out.println();
        Rectangle rectangleOne = new Rectangle(4,5);
        Rectangle rectangleTwo = new Rectangle(5,8);
        System.out.println("Area : "+rectangleOne.area()+" & "+"Perimeter : "+rectangleOne.perimeter());
        System.out.println("Area : "+rectangleTwo.area()+" & "+"Perimeter : "+rectangleTwo.perimeter());
    }
}