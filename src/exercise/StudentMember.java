package exercise;

import java.time.LocalDate;

public class StudentMember extends Member{
    private LocalDate exprireDate;

    public StudentMember(long id, String name, LocalDate exprireDate) {
        super(id, name);
        this.exprireDate = exprireDate;
    }

    public LocalDate getExprireDate() {
        return exprireDate;
    }

    public void setExprireDate(LocalDate exprireDate) {
        this.exprireDate = exprireDate;
    }

    @Override
    public int fee() {
        return 500;
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(exprireDate);
    }
}
