package ToyShop.VendingMachine;

import java.util.PriorityQueue;

public class VendingMachine<E> implements Behavior<E> {
    PriorityQueue<E> priorityQueue;

    public VendingMachine() {
        priorityQueue = new PriorityQueue<>();
    }

    @Override
    public void putToMachine(E toy) {

    }

    @Override
    public E getToy() {
        return null;
    }
}
