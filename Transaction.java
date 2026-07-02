public class Transaction {

    private int transactionId;
    private int bookId;
    private int memberId;
    private String transactionType;

    // Constructor
    public Transaction(int transactionId, int bookId, int memberId, String transactionType) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.transactionType = transactionType;
    }

    // Getters
    public int getTransactionId() {
        return transactionId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return "Transaction ID : " + transactionId +
               "\nBook ID        : " + bookId +
               "\nMember ID      : " + memberId +
               "\nType           : " + transactionType;
    }
}