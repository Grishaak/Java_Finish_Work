package ToyShop.VendingMachine;

import ToyShop.Toys.Toy;

public interface Behavior {
    void putToMachine(Toy toy);
    public Toy getToy();
}
