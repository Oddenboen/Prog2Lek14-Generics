package snacks;

import java.util.Random;

public class Smartie extends Snack implements Comparable<Smartie> {
    public enum Colors {
        Red, Orange, Blue, Green, Yellow, Pink, Violet, Brown
    }

    private Colors color;

    public Smartie() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        this.color = colors[random.nextInt(colors.length)];
    }

    @Override
    public int compareTo(Smartie other) {
        return this.getColor().compareTo(other.getColor());
    }

    public Smartie(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }
}
