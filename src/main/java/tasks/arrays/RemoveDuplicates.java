package tasks.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static String[] removeDuplicates(String[] array) {
        //метод должен возвращать новый массив в котором все повторно встречающиеся элементы удалены
        //например {"a", "b", "a", "b", "c", "c"} становится {"a", "b", "c"}
        //в остальном порядок меняться не должен, просто убрать повторные
        //имей ввиду что получается - ты не знаешь изначально какой длины будет массив с ответом

        for (int k = 0; k< array.length-1; k++) {

            for (int a = 1; a < array.length; a++) {
                if (k < a) {
                    if (array[k] == array[a]) {
                        array[a] = null;
                    }
                }
            }
        }
        int r=0;
        for (String t : array) {
            if (t == null) {
            }
            else{
                r++;
            }
        }

        String[] array2 = new String[r];
        int t = 0;
        for (int a =0; a < array.length-1; a++) {
            if (array[a] == null) {
            } else {
                array2[t] = array[a];
                    t++;
            }
        }
        return array2;
    }

    public static void main(String[] args) {
        String[] myarray = {"a","b","c","a","d","c","b","r","a","f","f"};
        System.out.println("Output Array :"+(Arrays.toString(removeDuplicates(myarray))));
    }
}

