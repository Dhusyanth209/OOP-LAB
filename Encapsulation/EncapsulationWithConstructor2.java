class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class EncapsulationWithConstructor2 {
    public static void main(String[] args) {
        Book b = new Book("The Great Gatsby");
        System.out.println("Book Title: " + b.getTitle());
    }
}