/**
 * Created on 25.12.2020
 *
 * @author me
 */
public class Gift {
    private Candy[] candies;
    private Jellybean[] jellybeans;

    public Gift setCandies(Candy... candies) {
        this.candies = candies;
        return this;
    }

    public Gift setJellybeans(Jellybean... jellybeans) {
        this.jellybeans = jellybeans;
        return this;
    }

    public int getTotalWeight() {
        return getTotalWeight(candies) + getTotalWeight(jellybeans);
    }

    public int getTotalPrice() {
        return getTotalPrice(candies) + getTotalPrice(jellybeans);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Подарок состоит из следующий предметов:");
        for (Candy candy : candies) {
            builder.append(candy);
        }
        for (Jellybean jellybean : jellybeans) {
            builder.append(jellybean);
        }
        return builder.append("\b.").toString();
    }

    private int getTotalWeight(Sweet[] sweets) {
        int weight = 0;
        for (Sweet sweet : sweets) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    private int getTotalPrice(Sweet[] sweets) {
        int price = 0;
        for (Sweet sweet : sweets) {
            price += sweet.getPrice();
        }
        return price;
    }
}
