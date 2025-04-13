package Library_management;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public boolean checkoutBook(int memberId, int bookId) {
        Member member = findMember(memberId);
        Book book = findBook(bookId);
        if (member != null && book != null && book.isAvailable()) {
            book.borrow();
            member.borrowBook(book);
            return true;
        }
        return false;
    }

    public boolean returnBook(int memberId, int bookId) {
        Member member = findMember(memberId);
        Book book = findBook(bookId);
        if (member != null && book != null && !book.isAvailable()) {
            book.returnBook();
            member.returnBook(book);
            return true;
        }
        return false;
    }


    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                return b;
            }
        }
        return null;
    }

    private Member findMember(int memberId) {
        for (Member m : members) {
            if (m.getId() == memberId) {
                return m;
            }
        }
        return null;
    }

    // Simple method to display library status
    public void printStatus() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
