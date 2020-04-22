package tasks.collections;

public class WorkListMetod {
//  Первоночально хотел реализовать через метод StringBuffer, кстати он тоже получился рабочий только для тестов.
    // Но если ввести примерно так ()())))), то будет баг
    public StringBuffer deleteBracket(StringBuffer bracket, StringBuffer pair){

        for (int k = pair.length() - 1; k >= 1; k = k - 2) {
            for (int i = bracket.length() - 1; i > 1; i--) {
                if (bracket.charAt(i) == pair.charAt(k) && bracket.charAt(i - 1) == pair.charAt(k - 1)) {
                    bracket.deleteCharAt(i);
                    bracket.deleteCharAt(i - 1);
                }
            }
        }
        return bracket;
    }

    public int compareList( StringBuffer strA, StringBuffer strB) {
        int a = 0;
        for (int k = 0; k < strB.length() - 1; k = k + 2) {
            for (int i = 0; i < strA.length() - 1; i++) {
                if (strA.charAt(i) == strB.charAt(k) && strA.charAt(i + 1) == strB.charAt(k + 1)){
                    a++;
                }
            }
        }
        return a;
    }

}
