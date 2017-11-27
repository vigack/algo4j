package linear;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by liang on 2017/11/28.
 */
public class Bag<Item> implements Iterable<Item>{

    private Node first;
    private int N = 0;

    private class Node{
        Item item;
        Node next;

        Node(Item item){
            this.item = item;
        }
    }

    public Bag(){
    }

    public  void add(Item item){
        N++;
        Node old = first;
        first = new Node(item);
        first.next = old;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
