package tasks.collections;

import java.util.LinkedList;
import java.util.List;

 class InputData {

    private final String AA ="[]";
    private final String BB ="()";
    private final String DD = "{}";

    String listData = AA+BB+DD;


    public String getListData() {
            return listData;
        }



    public LinkedList madeLinkedListNew(String strA, String strB) {  // метод собирания List зависимости от того будет
        List<Character> linkList = new LinkedList<>();                // добавление новых пар скобок или нет

        if (strB == null) {
            for (int i = 0; i < strA.length(); i++) {
                linkList.add(i, strA.charAt(i));
            }
            return (LinkedList) linkList;
        } else {
           strA = strA +strB;
            for (int i = 0; i < strA.length(); i++) {
                linkList.add(i, strA.charAt(i));
            }
            return (LinkedList) linkList;
        }

    }
}









