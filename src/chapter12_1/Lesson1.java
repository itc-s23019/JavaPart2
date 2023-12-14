package chapter12_1;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {
        List<String> greetings = new ArrayList<>();
        greetings.add("おはよう");
        greetings.add("こんにちは");
        greetings.add("こんばんは");

        for (String s:greetings) {
            System.out.println(s);
        }


        //greetings リストの0番目の要素を取得して表示する
        System.out.println(greetings.get(0));
        //その値が「おはよう」なら「yes」と表示
        if(greetings.get(0)=="おはよう"){
            System.out.println("YES");
        }
        //greetingsリストが「good morning」という要素をふくんでいるか
        //true　また　falseで表示する
        System.out.println(greetings.contains("good morning"));
        //greetingsリストが空いてなかったら、要素の数を表示する
        if (greetings.isEmpty() == false) {
            System.out.println(greetings.size());
        }
        //greetingsリストの２番目の要素を削除する
        System.out.println(greetings.remove(2));
    }
}
