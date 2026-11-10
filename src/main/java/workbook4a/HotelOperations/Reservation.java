package workbook4a.HotelOperations;

public class Reservation {

    String roomType;
    double price;
    int numberOfNights;
    boolean isWeekend;
    double reservationTotal;

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public boolean isWeekend() {
        return isWeekend;
    }
    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}


