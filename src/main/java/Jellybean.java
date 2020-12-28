/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Jellybean extends Sweet {
    private final String color;

    public Jellybean(int weight, int price, String color) {
        super("мармелад", weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(super.toString(), "цвет " + color);
    }
}
