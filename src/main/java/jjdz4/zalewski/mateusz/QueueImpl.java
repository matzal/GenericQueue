package jjdz4.zalewski.mateusz;

import java.util.ArrayList;
import java.util.List;

public class QueueImpl<T> implements Queue<T> {

    private List<T> queueList = new ArrayList<>();

    @Override
    public void enqueue(T o) {
        queueList.add(o);
    }

    @Override
    public T dequeue() {
        T firstOut = queueList.get(0);
        queueList.remove(0);
        return firstOut;
    }

    @Override
    public int size() {
        return queueList.size();
    }
}
