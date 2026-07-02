import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n========== Library Management System ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Register Member");
            System.out.println("6. View Members");
            System.out.println("7. Issue Book");
            System.out.println("8. Return Book");
            System.out.println("9. Transaction History");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(bookId, title, author));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    Book book = library.searchBook(searchId);

                    if (book != null)
                        System.out.println(book);
                    else
                        System.out.println("Book not found.");

                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int removeId = sc.nextInt();

                    library.removeBook(removeId);
                    break;

                case 5:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String memberName = sc.nextLine();

                    library.addMember(new Member(memberId, memberName));
                    break;

                case 6:
                    library.viewMembers();
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Enter Member ID: ");
                    int issueMemberId = sc.nextInt();

                    library.issueBook(issueBookId, issueMemberId);
                    break;

                case 8:
                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();

                    System.out.print("Enter Member ID: ");
                    int returnMemberId = sc.nextInt();

                    library.returnBook(returnBookId, returnMemberId);
                    break;

                case 9:
                    library.viewTransactions();
                    break;

                case 10:
                    System.out.println("Thank you for using Library Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}