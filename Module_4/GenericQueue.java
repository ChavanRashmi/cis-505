package Module_4;


import java.util.LinkedList;

public class GenericQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addFirst(item);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public Integer size() {
        return list.size();
    }
}
