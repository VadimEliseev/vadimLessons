package tasks;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b){
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


        //строчка ниже это return тоесть сейчас метод всегда возвращает 0, вне зависимости от a и b
        return 0;
    }

    public static void main(String[] args) {
        //смотри, здесь начинается выполнение программы, это метод main
        //в нем идет вызов метода gcd с параметрами a и b
        //тоесть здесь ты можешь только менять a и b, а весь код пишешь выше, внутри public static int gcd ....
        System.out.println(gcd(20, 15));
    }
}