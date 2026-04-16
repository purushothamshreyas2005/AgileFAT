import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();
            
            System.out.print("Enter number of books issued: ");
            int booksIssued = scanner.nextInt();
            System.out.print("Enter number of days borrowed: ");
            int daysBorrowed = scanner.nextInt();
            
            double totalFine = calculateFine(daysBorrowed);
            
            System.out.println("\n--- Library Borrowing Status ---");
            System.out.println("User ID: " + userId);
            System.out.println("Books Issued: " + booksIssued);
            System.out.println("Days Borrowed: " + daysBorrowed);
            System.out.println("Status: " + (totalFine > 0 ? "Overdue" : "On Time"));
            System.out.printf("Total Fine:\n", totalFine);
            scanner.close();
        }

    public static double calculateFine(int days) {
        if (days <= 7) return 0.0;
        int extraDays = days - 7;
        return extraDays * 2.00;
    }
}

