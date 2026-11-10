package workbook4a.HotelOperations;

public class Room {

    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}
