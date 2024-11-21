import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExamples {

    static void usingArrays(){
        String[] weekdays = new String[7];
        System.out.println(Arrays.toString(weekdays));

        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));

        weekdays = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        System.out.println(Arrays.toString(weekdays));

        for (String day : weekdays){
            System.out.println("Week day "+day);
        }

        for (int i =0;i<weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays));

        int[] input = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(input));

        for (int i =0; i<input.length;i++){
            input[i] = input[i]+1;
        }

        System.out.println(Arrays.toString(input));

    }

    void arrayList(){
        System.out.println("===========");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        cars.remove(1);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
    }

}
