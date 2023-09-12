package ToyShop.VendingMachine;

public interface Behavior<E> {
    void putToMachine(E toy);
    E getToy();
}
