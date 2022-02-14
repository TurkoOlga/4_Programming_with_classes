package task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookAggregator {
    private Book[] books;

    public BookAggregator(Book[] books) {
        this.books = books;
    }

    public Book[] getBooksSortedByPublishingHouse(String publishingHouse) {
        List<Book> result = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    public Book[] getBooksSortedByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    public Book[] getBooksSortedByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getYearOfPublishing() == year) {
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    @Override
    public String toString() {
        return "BookAggregator{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
