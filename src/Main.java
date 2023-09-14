import ToyShop.VendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.createCar("БМВ", 1, 2);
        vendingMachine.createConstructor("Лего", 2, 2);
        vendingMachine.createBear("Мишка", 3, 6);
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
    }
}