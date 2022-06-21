import ch.csbe.modul404.geometry.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    private Square square;

    @BeforeEach
    void init(){
        square = new Square();
    }

    @Test
    @DisplayName("Calculates Square Extent")
    public void testCalculateExtent() {
        assertEquals(20, square.calculateExtent(5));
    }

    @Test
    @DisplayName("Calculate Square Area")
    public void testCalculateArea() {
        assertEquals(25, square.calculateArea(5));
    }

    @Test
    @DisplayName("Calculate Square Side")
    public void testCalculateSiteLength() {
        assertEquals(5, square.calculateSideLength(25, 20));
        assertEquals(5, square.calculateSideLength(25, 0));
        assertEquals(5, square.calculateSideLength(0,20));
        assertThrows(IllegalArgumentException.class, () -> square.calculateSideLength(0, 0));
        assertThrows(IllegalArgumentException.class, () -> square.calculateSideLength(-5, 0));
        assertThrows(IllegalArgumentException.class, () -> square.calculateSideLength(0, -5));
        assertThrows(IllegalArgumentException.class, () -> square.calculateSideLength(-5, -5));
    }
}
