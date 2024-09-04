package LibraryManagementSystem;

public class ReferenceBook extends Book{

    String subject;

    public ReferenceBook(String title, String author, String ISBN, boolean available,String subject) {
        super(title, author, ISBN, available);
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject='" + subject + '\'' + '}';
    }
}
