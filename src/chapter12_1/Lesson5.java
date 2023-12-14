package chapter12_1;

import chapter12_2.Book;
import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Lesson5 {
    public static void main(String[] args) {
        //Bookクラスを作る
        //フィールドは　本の名前:：String
        //BookのインスタンスをTreeSetに入れる
        //本の名前順に表示（昇格）
        var tree = new TreeSet<Book>();
        tree.add(new Book("Harry Potter"));
        tree.add(new Book("お隣の天使様にいつの間にかダメ人間にされていた"));
        tree.add(new Book("サマータイムレンダ"));
        tree.add(new Book("ダーウィンズゲーム"));
        tree.add(new Book("ロシア語で時々ぼそっとデレる隣の席のアーリャさん"));
        tree.add(new Book("ようこそ実力至上主義の教室へ"));
        tree.add(new Book("Re:ゼロから始まる異世界生活"));
        tree.add(new Book("陰の実力者になりたくて"));
        tree.add(new Book("宇宙よりも遠い場所"));
        tree.add(new Book("ホリミヤ"));
        tree.add(new Book("シュタインズゲート"));
        tree.add(new Book("トニカクカワイイ"));
        tree.add(new Book("スパイ教室"));
        tree.add(new Book("凶乱令嬢ニア・リストン"));

        tree.forEach(System.out::println);
    }
}
