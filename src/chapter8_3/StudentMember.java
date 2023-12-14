package chapter8_3;

import chapter8_1.GeneralMember;

import java.time.LocalDate;

public class StudentMember extends GeneralMember {
    private LocalDate expDate;

    @Override
    public int membershipFee() {
        return 500;
    }

    public StudentMember(long id, String name, LocalDate expDate) {
        super(id, name);
        this.expDate = expDate;
    }

    public boolean isExpired() {
        LocalDate today = LocalDate.now();
        return today.isAfter(expDate);
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
