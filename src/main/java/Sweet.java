/**
 * Created on 25.12.2020
 *
 * @author me
 */
public abstract class Sweet {
    String name;
    int weight;
    int price;

    public Sweet(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n- " + name + " весом " + weight + " граммов, ценой " + price + " рублей, %s;";
    }
}
