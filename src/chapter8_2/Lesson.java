package chapter8_2;

public class Lesson {
    private String lessonId;
    private String lessonName;

    public Lesson(String lessonid, String lessonName) {
        lessonId = lessonId;
        lessonName = lessonName;
    }

    public int fee() {
        return 1000;
    }
    public String getLessonId() {
        return lessonId;
    }
    public String getLessonName() {
        return lessonName;
    }
}
