package task9;

public class Main {
    public static void main(String[] args) {
        Book[] books = createBooks();
        BookAggregator bookAggregator = new BookAggregator(books);

        bookAggregator.getBooksSortedByAuthor("Nesbo");
        bookAggregator.getBooksSortedByPublishingHouse("Machaon");
        bookAggregator.getBooksSortedByYear(2007);
    }

    private static Book[] createBooks() {
        Book book1 = new Book(134, "Harry Potter", "Joanne Rowling", "Machaon", 1997,
                678, 25.00, "hard cover");
        Book book2 = new Book(22, "Snowmen", "Nesbo", "Alpine", 2007, 456,
                12.00, "soft cover");
        Book book3 = new Book(2456, "Bigger", "Ivanov", "Alpine", 1856, 809,
                32.90, "hard cover");

        return new Book[]{book1, book2, book3};
    }
}
