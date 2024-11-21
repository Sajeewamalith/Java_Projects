public class Main {
    enum People{
        SANNUKA
    }

    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY
    }
    public static void main(String[] args) {

        System.out.println(People.SANNUKA);

        System.out.println("\n"+"--------------");
        Day day = Day.TUESDAY;
        switch (day){
            case MONDAY ->  System.out.println("Today is a Monday");
            case TUESDAY ->  System.out.println("Today is a Tuesday");
            case WEDNESDAY ->  System.out.println("Today is a Wednesday");

        }

        System.out.println("\n"+"--------------");
        Orange arg = Orange.SHANAKA;
        System.out.println(arg);
        System.out.println(arg.getDESC());

        System.out.println("\n"+"--------------");
        Apple apple =Apple.KAMAL;
        System.out.println(apple);
        System.out.println(apple.getDESC()+" "+apple.getAge()+"\n");

        for (Apple apple1: Apple.values()){
            System.out.println(apple1+" - "+apple1.getDESC()+", "+apple1.getAge());
        }


    }
}