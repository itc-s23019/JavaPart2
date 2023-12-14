package chapter12_2;

import java.util.Comparator;

public record Meibo (int number, String name) implements Comparable<Meibo> {

    @Override
    public int compareTo(Meibo o) {
        return Integer.compare(number, o.number);
    }
}
