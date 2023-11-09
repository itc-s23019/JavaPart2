package chapter7_6;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Joining {
    private String csv;
    private String delimiter;

    public Joining(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }

    public Joining(String delimiter) {
        this("", delimiter);
    }

    public Joining() {
        this("", ",");
    }

    public String getCsv() {
        return csv;
    }

    public void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }

    public static void main(String[] args) {
        Joining j = new Joining("", ",");

        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }

}
