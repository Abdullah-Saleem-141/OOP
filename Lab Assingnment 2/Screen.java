public class Screen {
 private int screenNumber;
 private String movieTitle;
 private Seat[][] seats;

public Screen(int screenNumber, String movieTitle, int rows, int cols) {
   this.screenNumber = screenNumber;
   this.movieTitle = movieTitle;
   seats = new Seat[rows][cols];

   for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
       seats[i][j] = new Seat(i, j, SeatType.REGULAR);
      }
   }
    }

  public boolean bookSeat(int row, int col) {
    if (row >= seats.length || col >= seats[0].length) {
   System.out.println("Invalid seat selection!");
       return false;
        }
  if (!seats[row][col].bookSeat()) {
    System.out.println("Seat already booked!");
   return false;
        }
   System.out.println("Seat booked successfully!");
   return true;
    }
    public void displayScreen() {
  System.out.println("\nScreen " + screenNumber + " - Movie: " + movieTitle);
   for (int i = 0; i < seats.length; i++) {
     for (int j = 0; j < seats[i].length; j++) {
    if (seats[i][j].isBooked()) {
    System.out.print(" [Booked] ");
       } else {
      System.out.print(" [" + i + "," + j + "] ");
     }
     }
     System.out.println();
    }
 }
}
