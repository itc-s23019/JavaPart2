package chapter7_4;

import javax.swing.plaf.synth.SynthTableHeaderUI;

public class Sample2 {
    public static void main(String[] args) {
        NoConstructor nc = new NoConstructor();
        System.out.println(nc.getNumber());
        System.out.println(nc.getStr());

    //    int a;
    //    System.out.println(a);
    }
}
