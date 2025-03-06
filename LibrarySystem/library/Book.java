package library;

public class Book {
    private String title;
    private String issn;
    private Date publicationDate;
    private Person author;

    public Book() {
        title = "";
        issn = "";
        publicationDate = new Date();
        author = new Person();
    }
    public Book(String title, String issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public Book(Book other) {
        this.title = other.title;
        this.issn = other.issn;
        this.publicationDate = new Date(other.publicationDate);
        this.author = new Person(other.author);
    }

    public String getTitle() { return title; }
    public String getIssn() { return issn; }
    public Date getPublicationDate() { return publicationDate; }
    public Person getAuthor() { return author; }

    public void setTitle(String title) { this.title = title; }
    public void setIssn(String issn) { this.issn = issn; }
    public void setPublicationDate(Date publicationDate) { this.publicationDate = publicationDate; }
    public void setAuthor(Person author) { this.author = author; }
}
