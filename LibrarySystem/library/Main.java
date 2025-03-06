package library;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Lahore");
        Person author1 = new Person("Saad", "Author", address);
        Person author2 = new Person("Abdullah", "Author", address);
        Person author3 = new Person("Awaim", "Author", address);
        Person author4 = new Person("Ali", "Author", address);

        Date pubDate1 = new Date(10, 5, 2018);
        Date pubDate2 = new Date(22, 9, 2020);
        Date pubDate3 = new Date(15, 3, 2022);

        Book book1 = new Book("Encyclopedia", "1111-2222", pubDate1, author1);
        Book book2 = new Book("Angan", "3333-4444", pubDate2, author2);
        Book book3 = new Book("Mohabbat", "5555-6666", pubDate3, author3);

        Person incharge = new Person("Awaim", "Incharge", address);
        Person staff = new Person("Ali", "Staff", address);
        Library library1 = new Library("City Library", book1, incharge, staff);
        Library library2 = new Library("National Library", book2, incharge, staff);
        Library library3 = new Library("Community Library", book3, incharge, staff);

        library1.showLibraryDetails();
        library2.showLibraryDetails();
        library3.showLibraryDetails();
    }
}
