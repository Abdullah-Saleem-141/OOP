package library;

public class Library {
    private String name;
    private Book book;
    private Person incharge;
    private Person staff;

    public Library() {
        this.name = "Unknown Library";
        this.book = new Book();
        this.incharge = new Person();
        this.staff = new Person();
    }

    public Library(String name, Book book, Person incharge, Person staff) {
        this.name = name;
        this.book = book;
        this.incharge = incharge;
        this.staff = staff;
    }

    public Library(Library other) {
        this.name = other.name;
        this.book = new Book(other.book);
        this.incharge = new Person(other.incharge);
        this.staff = new Person(other.staff);
    }

    public String getName() { return name; }
    public Book getBook() { return book; }
    public Person getIncharge() { return incharge; }
    public Person getStaff() { return staff; }

    public void setName(String name) { this.name = name; }
    public void setBook(Book book) { this.book = book; }
    public void setIncharge(Person incharge) { this.incharge = incharge; }
    public void setStaff(Person staff) { this.staff = staff; }

    public void showLibraryDetails() {
        System.out.println("Library Name: " + name);
        System.out.println("Book: " + (book != null ? book.getTitle() : "No Book"));
        System.out.println("Incharge: " + (incharge != null ? incharge.getName() : "No Incharge"));
        System.out.println("Staff: " + (staff != null ? staff.getName() : "No Staff"));
    }
}
