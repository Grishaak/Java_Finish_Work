package ToyShop.Toys;

public abstract class Toy implements ToyInterface, Comparable<Toy> {
    private String name_toy;
    private int id;
    private double weight;
    private double absoluteWeight;

    public String getName_toy() {
        return name_toy;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public Toy(String name_toy, int id, double weight) {
        this.name_toy = name_toy;
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name: " + name_toy
                + "; id: " + id
                + "; chance to drop: " + String.valueOf(weight) + "%\n";
    }

    public void changeWeight(double newWeight) {
        weight = newWeight;
    }

    @Override
    public int compareTo(Toy o) {
        return Double.compare(this.weight, o.weight);
    }
}
