package Library_management;

public class Main {
    public static void main(String[] args){
        Library library = new Library();

        // Add books
        Book book1 = new Book(1, "1984", "George Orwell");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        // Register members
        Member member1 = new Member(1, "Alice");
        Member member2 = new Member(2, "Bob");
        library.registerMember(member1);
        library.registerMember(member2);

        // Checkout a book
        boolean checkoutResult = library.checkoutBook(1, 1);
        System.out.println("Checkout Result: " + checkoutResult);

        // Return a book
        boolean returnResult = library.returnBook(1, 1);
        System.out.println("Return Result: " + returnResult);

        // Print library status
        library.printStatus();
    }
}
