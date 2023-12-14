package chapter12_1;

import chapter11_1.Apple;

import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        var list = getAppleList();
        list.forEach(t -> System.out.println(t));

    }

    public static List<Apple>getAppleList(){
        var list = List.of(
                new Apple(120, "red"),
                new Apple(280, "green"),
                new Apple(350, "red"),
                new Apple(250, "red")
        );
        return list;
    }
}
