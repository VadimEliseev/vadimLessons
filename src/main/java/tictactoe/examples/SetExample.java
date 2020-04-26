package tictactoe.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");
        set2.add("a");
        set2.add("c");
        set3.toArray(new String[]{"as"});
        String str = set3.toString();

        System.out.println(set1);
        System.out.println(set3);
        set2.removeAll(set1);

        System.out.println(set2);
        System.out.println("a".hashCode());

        Set<Person> students = new HashSet<>();

        Person vasya = new Person("Vasya", "Smirnov");

        students.add(vasya);


        students.contains(vasya);

        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(2, "TWO");

        System.out.println(numbers.keySet());


    }
}
