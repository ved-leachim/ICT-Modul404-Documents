import ch.csbe.modul404.geometry.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    private Circle circle;

    @BeforeEach
    void init() {
        circle = new Circle();
    }

    @Test
    @DisplayName("Calculate Circle Extent")
    public void testCalculateExtent() {
        assertEquals(31.4159, circle.calculateExtend(5));
    }

    @Test
    @DisplayName("Calculate Circle Area")
    public void testCalculateArea() {
        assertEquals(78.5398, circle.calculateArea(5));
    }

    @Test
    @DisplayName("Calculate Circle Radius")
    public void testCalculateRadius() {
        assertEquals(5, circle.calculateRadius(78.5398, 31.4159));
        assertEquals(5, circle.calculateRadius(78.5398, 0));
        assertEquals(5, circle.calculateRadius(0, 31.4159));
        assertThrows(IllegalArgumentException.class, () -> circle.calculateRadius(0, 0));
        assertThrows(IllegalArgumentException.class, () -> circle.calculateRadius(-5, 0));
        assertThrows(IllegalArgumentException.class, () -> circle.calculateRadius(0, -10));
        assertThrows(IllegalArgumentException.class, () -> circle.calculateRadius(-5, -10));
    }
}
