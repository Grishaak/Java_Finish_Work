import ToyShop.VendingMachine.VendingMachine;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.createCar("БМВ", 1, 45.1);
        vendingMachine.createCar("Ауди", 2, 34.1);
        vendingMachine.createCar("Мерседес", 3, 43.5);
        vendingMachine.createConstructor("Лего-дупло", 4, 37.3);
        vendingMachine.createConstructor("Лего-бионикл", 5, 57.5);
        vendingMachine.createBear("Тигр(редкий)", 9, 12.11);
        vendingMachine.createConstructor("Лего-ниндзяго", 6, 63.654);
        vendingMachine.createBear("Мишка", 7, 54.43);
        vendingMachine.createBear("Зайчик", 8, 45.1);
//        System.out.println(vendingMachine.showAll());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
        System.out.println(vendingMachine.settleGame());
    }
}