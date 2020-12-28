/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Candy extends Sweet {
    private final int caloric;

    public Candy(int weight, int price, int caloric) {
        super("конфета", weight, price);
        this.caloric = caloric;
    }

    @Override
    public String toString() {
        return String.format(super.toString(), "калорийностью " + caloric + " калорий");
    }
}
