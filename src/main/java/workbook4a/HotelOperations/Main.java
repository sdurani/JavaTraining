package workbook4a.HotelOperations;

public class Main {

    public static void main(String[] args) {
        Reservation reservation1 = new Reservation();
        Room room = new Room();
        // changed reservation's room type
        String roomType = "king";

        reservation1.setRoomType(roomType);
        System.out.println(reservation1.getRoomType());
    }

}
