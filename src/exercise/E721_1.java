package exercise;

import chapter7_2.Joining;

import javax.swing.text.Style;

public class E721_1 {
    public static void main(String[] args) {
        Joining j = new Joining("-");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());

        Joining j2 = new Joining(",");
        j2.add("apple");
        j2.add("banana");
        j2.add("peach");
        System.out.println(j2.getCsv());
    }
}
