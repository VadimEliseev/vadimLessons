package tasks;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {

    public static int gcd(int a, int b){
        List<Integer> list = new ArrayList<Integer>();
        if (a == b)
            return a;
        else if (a>b) {
            int d;
            for (d = 2; d < b; d++) {
                int i = a / d;
                if (a % d == 0)
                    list.add(i);
            }
            for (d = list.size() - 1; d > 0; d--) {
                if (b % list.get(d - 1) != 0)
                    list.remove(d - 1);

            }
            return list.get(0);
        }

        else {
            int d;
            for (d = 2; d < a; d++) {
                int i = b / d;
                if (b % d == 0)
                    list.add(i);
            }

            for (d = list.size() - 1; d > 0; d--) {
                if (a % list.get(d - 1) != 0)
                    list.remove(d - 1);
            }
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        //смотри, здесь начинается выполнение программы, это метод main
        //в нем идет вызов метода gcd с параметрами a и b
        //тоесть здесь ты можешь только менять a и b, а весь код пишешь выше, внутри public static int gcd ....
        System.out.println(gcd(20, 15));
    }
}
