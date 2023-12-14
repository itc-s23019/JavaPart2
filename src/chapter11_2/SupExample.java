package chapter11_2;
import java.util.function.Supplier;

public class SupExample {
    public static void main(String[] args) {
//        Supplier<Double> randomValue = () -> Math.random();
        Supplier<Double> randomValue = Math::random;
        System.out.print(randomValue.get());
    }
}
