/*package chapter12_2;


import java.util.HashSet;

public class Sample6 {
    public static void main(String[] args) {
        //文字列のHashSetを作る
        //山田、田中、池田を追加する
        var set = new HashSet<String>();
        set.add(new String("山田"));
        set.add(new String("田中"));
        set.add(new String("池田"));

        //p.292参考
        //何件の要素があるか表示する
        System.out.println(set.size());

        //セットの中身が空かどうか表示する　(true or false)
        System.out.println(set.isEmpty());

        //池田を削除
        set.remove("池田");

        //セットの中身をすべて表示する
        set.forEach(System.out::println);

    }
}


 */