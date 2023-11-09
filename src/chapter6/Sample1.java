package chapter6;

public class Sample1 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中宏", 300000, 100000);

        System.out.println("納税者番号" + tax.zeigaku());
        System.out.println("氏　名" + tax.zeigaku());
        System.out.println("所得額" + tax.zeigaku());
        System.out.println("控除額" + tax.zeigaku());

        System.out.println("所得税" + tax.zeigaku());
    }
}
