import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetsExamples {
    static void treeSetsMethods(){
        System.out.println("\n"+"-----Tree Sets Examples----");

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        for (int i =0;i<treeSet.size();i++){
            System.out.println(treeSet);
        }


        treeSet.add(6);
        System.out.println(treeSet);


        Set<String> wordSet = new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);


        Set<String> wordSetSecond = new TreeSet<>(Comparator.comparing(String:: length));
        wordSetSecond.add("tiger");
        wordSetSecond.add("giraffe");
        wordSetSecond.add("bear");
        System.out.println(wordSetSecond);

        wordSetSecond.add("wolf");
        System.out.println(wordSetSecond);

        wordSetSecond.add("cat");
        System.out.println(wordSetSecond);

        wordSetSecond.remove("giraffe");
        System.out.println(wordSetSecond);


    }
}
