package tasks.collections;

import java.util.LinkedList;
import java.util.Scanner;


public class ValidParentheses {

    private static String inBrecket; // переменная для добавления новых скобок

    public static boolean checkValidness(String strA)  {
        // довольно классическая задача
        // написать функцию, проверяющую правильность комбинации скобок
        // на вход подается комбинация из обычных, квадратных или фигурных скобок например "[()[{}]]"
        // нужно проверить - является ли такая комбинация верной:
        // 1) каждой открывающей скобке должна соответсвовать закрывающая скобка
        // 2) каждая пара скобок должна начинаться с отрывающей
        // 3) если пара скобок открывается внутри другой пары, то и закрываться она должна внутри нее
        // валидные пары ([{}]), (()[{()}([])])
        // не валидные {], ({[}])
        // нужно попытаться написать код так, чтобы можно было легко добавить новые типы скобок, например <>
        // возможно стоит создать и применить какие-то дополнительные классы
        // чтобы понять какие - нужно ответить на вопрос, какую функцию они выполняют? в чем их смысл

        // подсказка: использовать стэк https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B5%D0%BA
        // в java он реализован в LinkedList (методы push() и pop() )

        // (*) Сделать так, чтобы добавить новый вид скобок можно было максимально просто и понятно.

        // создание двух LinkedList
        InputData input = new InputData();
        LinkedList bracket = input.madeLinkedListNew(strA, inBrecket); // List из введеных скобок
        LinkedList pairBracket = input.madeLinkedListNew(input.getListData(), inBrecket); // List из валидных пар :{}[]()


            ValidParentheses resaultBracketList = new ValidParentheses();
            while (resaultBracketList.equalsTwoLinked(bracket, pairBracket)) {  // сравнение-удаления двух List
                resaultBracketList.removeBracket(bracket, pairBracket);
            }

        return bracket.size() == 0;

    }

    private boolean equalsTwoLinked (LinkedList linkA, LinkedList linkB){  // метод сравнения двух списков

        for (int k = 0; k < linkB.size() - 1; k = k + 2) {
            for (  int i = 0; i < linkA.size() - 1; i++) {
                if (linkA.get(i) == linkB.get(k) && linkA.get(i + 1) == linkB.get(k + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
     private LinkedList removeBracket(LinkedList linkA, LinkedList linkB) {  // метод удаления валидных пар

        for (int k = 0; k < linkB.size() - 1; k = k+2) {  //  хотел вмосто этой части вставить метод equalsTwoLinked
            for (int i = 0; i < linkA.size() - 1; i++) {  // но что-то пока не получилось
                if (linkA.get(i) == linkB.get(k) && linkA.get(i + 1) == linkB.get(k + 1)) {
                    linkA.remove(i + 1);
                    linkA.remove(i);
                }
            }
        }
        return linkA;
    }

    public static void main(String[] args) {
        //double d = 23.4;
        //System.out.println(d);
        System.out.println("Можете добавить новые пары скобок  и нажмите ENTER :");
        System.out.println(" или просто нажмите ENTER если просто хотите продолжить: ");
        System.out.println(" ");

        Scanner scan = new Scanner(System.in);
        inBrecket = scan.nextLine();


        System.out.println("Введите любое колличество скобок и нажмите ENTER :");
        System.out.println(" ");
        String scanList = scan.nextLine();
        System.out.println("");


        System.out.println(checkValidness(scanList));
    }
}