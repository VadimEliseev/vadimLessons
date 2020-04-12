package tasks.arrays;

public class ReverseArray {
    public static String[] reverseArray(String[] array) {
        //метод дожен возвращать НОВЫЙ массив который является копией этого, но записанный задом наперед
        //(последний элемент становится первым итд)
        System.out.print("Input Array :");
        for (String n : array) {
            System.out.print("   " + n);
        }
        System.out.println(" ");

        String[] arrayfinish = new String[array.length];

        for (int a=0; a<array.length; a++) {
            arrayfinish[arrayfinish.length-1-a] = array[a];
        }
        System.out.print("Output Array :");
        for (String n : arrayfinish) {
            System.out.print("   " + n);
        }
        return arrayfinish ;
    }
    public static void main(String[] args) {
        String[]  myarray = {"Bob","Ivan","Garry","Tom"};
        reverseArray(myarray);
    }
}
