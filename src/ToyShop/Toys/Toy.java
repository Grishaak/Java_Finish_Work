package ToyShop.Toys;

public abstract class Toy {
    private String name_toy;
    private int id;
    private int weight;

    public String getName_toy() {
        return name_toy;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public Toy(String name_toy, int id, int weight) {
        this.name_toy = name_toy;
        this.id = id;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name: " + name_toy
                + "id: " + id
                + "weight: " + String.valueOf(weight * 10) + "%";
    }
}
