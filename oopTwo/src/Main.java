public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("Area : "+rectangle.RectangelArea());
        System.out.println("Perimeter : "+rectangle.squarePerimeter());

        System.out.println();

        Ellipse ellipse = new Ellipse();
        System.out.println("Area : "+ellipse.circleArea());
        System.out.println("Perimeter : "+ellipse.circlePerimeter());
        System.out.println("Eccentricity : "+ellipse.eccentricMethod());

    }



        }


