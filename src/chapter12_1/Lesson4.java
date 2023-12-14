package chapter12_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Lesson4
public class Lesson4 {
    public static void main(String[] args) {
        //Mountainクラス
        //フィールド名 山の名前 :String 高さ :int
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("エベレスト", 8848));
        mountains.add(new Mountain("ゴドウィンオースチン", 8611));
        mountains.add(new Mountain("カンチェンジュンガ", 8586));
        mountains.add(new Mountain("ローツェ", 8516));

        mountains.sort(Comparator.comparing(Mountain::getFeet));
        mountains.forEach(System.out::println);
        mountains.sort(Comparator.comparing(Mountain::getName));
        mountains.forEach(System.out::println);

    }
}