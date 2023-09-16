package ToyShop.VendingMachine;

import ToyShop.FileHandler.WriteIO;
import ToyShop.Toys.BearToy;
import ToyShop.Toys.CarToy;
import ToyShop.Toys.ConstructorToy;
import ToyShop.Toys.Toy;

import java.io.FileWriter;
import java.util.*;

public class VendingMachine implements Behavior {
    private final PriorityQueue<Toy> priorityQueue;
    private final String path = "text.txt";
    private WriteIO writer;

    public VendingMachine() {
        priorityQueue = new PriorityQueue<>();
        writer = new WriteIO();
    }

    @Override
    public void putToMachine(Toy toy) {
        priorityQueue.add(toy);
    }

    @Override
    public Toy getToy() {
        return priorityQueue.poll();
    }

    public void createCar(String name, int id, double weight) {
        Toy car = new CarToy(name, id, weight);
        putToMachine(car);
    }

    public void createBear(String name, int id, double weight) {
        Toy bear = new BearToy(name, id, weight);
        putToMachine(bear);
    }

    public void createConstructor(String name, int id, double weight) {
        Toy lego = new ConstructorToy(name, id, weight);
        putToMachine(lego);
    }

    public String showAll() {
        StringBuilder sb = new StringBuilder();
        for (Toy toy : this.priorityQueue) {
            sb.append(toy.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String settleGame() {
        ArrayList<Double> chanceList = createChanceList();
        Random random = new Random();
        double playerChance = random.nextFloat() * 100;
        if (priorityQueue.isEmpty() || chanceList.isEmpty()) {
            writer.writeFile("пусто.\n");
            return "пусто.";
        }
        double x = chanceList.get(0);
        if (playerChance <= x) {
            Toy toy = priorityQueue.poll();
            String st = toy.toString();
            writer.writeFile(st);
            return st;
        }
        writer.writeFile("ничего не выпало.\n");
        return "ничего не выпало.";
    }

    public ArrayList<Double> createChanceList() {
        ArrayList<Double> arr = new ArrayList<>();
        int result = 0;
        for (Toy toy : priorityQueue) {
            result += toy.getWeight();
        }
        for (Toy toy : priorityQueue) {
            double absoluteChance = (toy.getWeight() / result) * 100;
            arr.add(absoluteChance);
        }
        return arr;
    }

    public void showChanceList(ArrayList<Double> arr) {
        if (!arr.isEmpty()) {
            for (Double element : arr) {
                System.out.println(element);
            }
        }
    }
}
