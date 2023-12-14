package chapter8_2;

public class GeneralMember {

    private long id;
    private String name;

    private Lesson lessson;
    public GeneralMember(long id, String name, Lesson lessson) {
        this.id = id;
         this.name = name;
    }
    public int membershipFee() {
        return 1000;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int fee() {
        return lessson.fee();
    }

    public String getLessonId() {
        return lessson.getLessonId();
    }

    public String getLessonName() {
        return lessson.getLessonName();
    }
}

