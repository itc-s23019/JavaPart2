package chapter9;

import java.awt.dnd.DragGestureEvent;
import java.time.LocalDate;

public class Sample3 {
    public static void main(String[] args) {
        Member m1 = new StudentMember(
                200, "木村一郎",
                LocalDate.of(2026, 3, 31)
        );

//        Member m1 = new SeniorMember(
//                150, "鈴木浩二",
//                LocalDate.of(1960, 3, 31)
//        );

//        m1.isExpired();             //Member に isExpired()　が未定義なのでだめ
//        StudentMember sm  = (StudentMember) m1;
//        System.out.println("期限切れ?=" + sm.isExpired());
        if (m1 instanceof StudentMember) {
            StudentMember sm = (StudentMember) m1;
            System.out.println("期限日=" + sm.getExpireDate());
        }

        if (m1 instanceof StudentMember stm) {
            System.out.println("期限日=" + stm.getExpireDate());
        }

        Object o = new GeneralMember(200, "木村一郎");

        if (o instanceof Member m2) {
            System.out.println("名前=" + m2.getName());
        }
    }
}
