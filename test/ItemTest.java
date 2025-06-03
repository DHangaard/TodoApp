import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void markAsDoneWhenFalseTest() {
        //Arrange
        Item testItemFalse = new Item ("Test", false);

        // Act
        testItemFalse.markAsDone();

        // Assert
        assertTrue(testItemFalse.getIsDone());
    }

    @Test
    void markAsDoneWhenTrueTest() {
        //Arrange
        Item testItemTrue = new Item ("Test", true);

        // Act
        testItemTrue.markAsDone();

        // Assert
        assertTrue(testItemTrue.getIsDone());
    }
}