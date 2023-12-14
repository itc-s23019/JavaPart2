package chapter11_1;

public class Select_1 implements Predicate{
    @Override
    public boolean test(Apple a) {
        return a.weight() >= 300;
    }
}
