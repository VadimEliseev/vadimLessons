package tasks.arrays;


import java.util.*;

public class RemoveDuplicates {


    public static String[] removeDuplicates(String[] array) {
        //метод должен возвращать новый массив в котором все повторно встречающиеся элементы удалены
        //например {"a", "b", "a", "b", "c", "c"} становится {"a", "b", "c"}
        //в остальном порядок меняться не должен, просто убрать повторные
        //имей ввиду что получается - ты не знаешь изначально какой длины будет массив с ответом

        Set<String> linkHaSet = new LinkedHashSet<>(Arrays.asList(array));

        String[] stringArray = linkHaSet.toArray(new String[0]);

        return stringArray;




    }

    public static void main(String[] args) {
        //String[] myarray = {"a","b","c","a","d","c","b","r","a","f","f","a"};
        //System.out.println("Output Array :"+Arrays.toString(removeDuplicates(myarray)));
        //System.out.println();

    }


}


