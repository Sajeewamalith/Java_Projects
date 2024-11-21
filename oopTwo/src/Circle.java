public class Circle  implements Eccentric,Shape{
    @Override
    public double eccentricMethod() {
        double c = 1-((b*b)/(a*a));
        double e = Math.pow(c,0.5);
        return e;
    }
    public double circleArea(){
        double Carea = 3.14*a*b;
        return Carea;
    }

    public double circlePerimeter(){
        double r =(a*a+b*b)/2;
        double Cperimeter = 2*3.14*Math.pow(r,0.5);
        return Cperimeter;
    }
    }
