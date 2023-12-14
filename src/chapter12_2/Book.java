package chapter12_2;

import javax.lang.model.element.NestingKind;

public class Book implements Comparable<Book> {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
