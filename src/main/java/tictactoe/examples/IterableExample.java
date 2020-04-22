package tictactoe.examples;

import java.util.Iterator;

public class IterableExample {
    public static void main(String[] args) {
        MyCollectionWithIterable my = new MyCollectionWithIterable();

        for(int i : my){
            System.out.println(i);
        }

    }
}

class MyCollectionWithIterable implements Iterable<Integer> {
    private final int[] data = new int[]{5,4,3};

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Integer> {
        int i = 0;
        @Override
        public boolean hasNext() {
            return i < data.length;
        }

        @Override
        public Integer next() {
            return data[i++];
        }
    }
}
