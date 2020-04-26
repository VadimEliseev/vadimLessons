package tasks.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static String[] reverseArray(String[] array) {
        //метод дожен возвращать НОВЫЙ массив который является копией этого, но записанный задом наперед
        //(последний элемент становится первым итд)
        String[] arrayfinish = new String[array.length];
        for (int a = 0; a < array.length; a++) {
            arrayfinish[arrayfinish.length - 1 - a] = array[a];
        }
        return arrayfinish;
    }

    public static void main(String[] args) {


    }
}
