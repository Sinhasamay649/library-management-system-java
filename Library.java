import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    private int transactionCounter = 1;

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View Books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println("-------------------------");
            System.out.println(book);
        }
    }

    // Search Book
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Remove Book
    public void removeBook(int bookId) {
        Book book = searchBook(bookId);

        if (book != null) {
            books.remove(book);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Register Member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully!");
    }

    // View Members
    public void viewMembers() {

        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        for (Member member : members) {
            System.out.println("-------------------------");
            System.out.println(member);
        }
    }

    // Search Member
    public Member searchMember(int memberId) {

        for (Member member : members) {

            if (member.getMemberId() == memberId) {
                return member;
            }

        }

        return null;
    }

    // Issue Book
    public void issueBook(int bookId, int memberId) {

        Book book = searchBook(bookId);
        Member member = searchMember(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book already issued.");
            return;
        }

        book.setIssued(true);

        transactions.add(new Transaction(
                transactionCounter++,
                bookId,
                memberId,
                "Issue"));

        System.out.println("Book issued successfully.");
    }

    // Return Book
    public void returnBook(int bookId, int memberId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("Book is already available.");
            return;
        }

        book.setIssued(false);

        transactions.add(new Transaction(
                transactionCounter++,
                bookId,
                memberId,
                "Return"));

        System.out.println("Book returned successfully.");
    }

    // Transaction History
    public void viewTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction transaction : transactions) {
            System.out.println("-------------------------");
            System.out.println(transaction);
        }
    }
}