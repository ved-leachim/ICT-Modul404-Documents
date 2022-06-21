import ch.csbe.modul404.geometry.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach()
    void init() {
        rectangle = new Rectangle();
    }

    @DisplayName("Calculate Rectangle Extent")
    @Test
    public void testCalculateExtent() {
         assertEquals(30, rectangle.calculateExtent(10, 5));
    }

    @DisplayName("Calculate Rectangle Area")
    @Test
    public void testCalculateArea() {
        assertEquals(20, rectangle.calculateArea(10,2));
    }
}
