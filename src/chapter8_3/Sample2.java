package chapter8_3;

import chapter8_1.GeneralMember;
import chapter8_1.StudentMember;

import java.time.LocalDate;

public class Sample2 {
    public static void main(String[]args) {
        GeneralMember gem = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));


        System.out.println("id="+ gem.getId());
        System.out.println("name="+ gem.getName());
        System.out.println("会費="+gem.membershipFee());
//            System.out.println("期限日="+ gem.isExpired());
//            System.out.println("期限日か="+ gem.getExpDate());
    }
}