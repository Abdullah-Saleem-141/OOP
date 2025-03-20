import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        Screen screen = new Screen(1, "Sanam Teri Kasam", 5, 5);
 boolean moreTickets = true;
    while (moreTickets) {
    screen.displayScreen(); 
            
 System.out.print("Enter row number: ");
  int row = scanner.nextInt();
   System.out.print("Enter column number: ");
   int col = scanner.nextInt();
 screen.bookSeat(row, col);
            
   System.out.print("Do you want to book another ticket? (yes/no): ");
   String choice = scanner.next().toLowerCase();
   moreTickets = choice.equals("yes");
        }

 System.out.println("Booking complete.");
scanner.close();
    }
}
