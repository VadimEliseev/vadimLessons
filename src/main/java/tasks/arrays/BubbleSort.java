package tasks.arrays;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        //Arrays.sort(array);   //Если я правильно понял данный стандартный метод делает все согластно заданию
        //System.out.println(Arrays.toString(array));
        //}
        System.out.print("Input Array :");
        System.out.println(Arrays.toString(array));
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
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] myArray = {1,45,1,7,3,5,2,9};
        bubbleSort(myArray);
    }
}