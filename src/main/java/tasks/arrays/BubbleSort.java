package tasks.arrays;
import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {

        //нужно отсортировать этот массив по возрастанию методом "пузырька"
        //https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC


        //Arrays.sort(array);   //Можно наверное стандартным методом это сделать, но задача скорее всего не в этом
        //System.out.println(Arrays.toString(array));
        //}

        //System.out.print("Input Array :");
        //System.out.println(Arrays.toString(array));
        int k=0;
        while (k<array.length-1) {
            for (int n = 0; n < array.length - 1; n++) {
                if (array[n] > array[n + 1]) {
                    int a = array[n + 1];
                    array[n + 1] = array[n];
                    array[n] = a;
                }
            }
            k++;
        }
        System.out.print("Output Array :");
        return array;
    }

    public static void main(String[] args) {
        int[] myArray = {1,45,1,7,3,5,2,9};
        System.out.println(Arrays.toString(bubbleSort(myArray)));
    }
}