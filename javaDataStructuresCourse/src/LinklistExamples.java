import java.util.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinklistExamples {

    public LinklistExamples(){}

    static void methodCheck(){
        System.out.println("\n"+"--------Link list------");

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        shoppingList.add("avocado");
        System.out.println(shoppingList);

        shoppingList.add(1,"mango");
        System.out.println(shoppingList);

        shoppingList.remove(3);
        System.out.println(shoppingList);

        //List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
        //System.out.println(synchronizedShoppingList);
    }
}
