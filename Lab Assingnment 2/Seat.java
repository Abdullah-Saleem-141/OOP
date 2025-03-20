public class Seat {
 private int rowNumber, seatNumber;
 private SeatType type;
 private boolean isBooked;

 public Seat(int rowNumber, int seatNumber, SeatType type) {
  this.rowNumber = rowNumber;
  this.seatNumber = seatNumber;
  this.type = type;
  this.isBooked = false;
    }

 public boolean bookSeat() {
   if (isBooked) return false;
   isBooked = true;
   return true;
    }

  public boolean isBooked() {
  return isBooked;
  }
 public void display() {
        System.out.print(isBooked ? "[X] " : "[O] ");
    }
}
