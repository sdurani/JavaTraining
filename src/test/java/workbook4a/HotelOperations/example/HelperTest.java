package workbook4a.HotelOperations.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @Test
    void fullname() {

        // arrange
        String firstName = "Thuan";
        String lastName = "Luu";
        String expectedResult = "Thuan Luu";

        // act
        String result = Helper.fullname(firstName, lastName);

        // assert
        // verifies if the expected is the same as result
        assertEquals(expectedResult, result);
    }
}