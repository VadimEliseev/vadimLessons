package tasks;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        /*
                              ^      ^
                              |      |
                              |      |
        числа                 a  и   b

        метод должен вернуть наибольший общий делитель чисел a и b

        "вернуть" значит написать "return ans"; где ans это ответ
        в коде может быть несколько return ов, но выполнение метода закончится на первом встретившимся

        напоминаю, что наибольший общий делитель лежит в дапазоне от 2 до наименьшего из чисел
         */
        List<Integer> list = new ArrayList<Integer>();
        if (a == b)
            return a;
        else if (a > b) {

            for (int d = 2; d < b; d++) {
                int i = a / d;
                if (a % d == 0)
                    list.add(i);
            }
            for (int d = list.size() - 1; d > 0; d--) {
                if (b % list.get(d - 1) != 0)
                    list.remove(d - 1);
            }
            return list.get(0);
        }

        else {
            for (int d = 2; d < a; d++) {
                int i = b / d;
                if (b % d == 0)
                    list.add(i);
            }
            for (int d = list.size() - 1; d > 0; d--) {
                if (a % list.get(d - 1) != 0)
                    list.remove(d - 1);
            }
            return list.get(0);
        }
    }

    public static void main(String[] args) {
        //смотри, здесь начинается выполнение программы, это метод main
        //в нем идет вызов метода gcd с параметрами a и b
        //тоесть здесь ты можешь только менять a и b, а весь код пишешь выше, внутри public static int gcd ....
        System.out.println(gcd(20, 15));
    }
}
