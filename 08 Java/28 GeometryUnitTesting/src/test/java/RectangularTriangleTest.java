import ch.csbe.modul404.geometry.RectangularTriangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangularTriangleTest {
    private RectangularTriangle rectangularTriangle;

    @BeforeEach
    void init () {
        rectangularTriangle = new RectangularTriangle();
    }

    @Test
    @DisplayName("Calculate RectangularTriangle Extent")
    public void testCalculateExtent(){
        assertEquals(18, rectangularTriangle.calculateExtent(7, 6, 5));
    }

    @Test
    @DisplayName("Calculate RectangularTriangle Area")
    public void testCalculateArea(){
        assertEquals(25, rectangularTriangle.calculateArea(5, 10));
    }

    @Test
    @DisplayName("Calculate RectangularTriangle Ground")
    public void testCalculateGround(){
        assertEquals(5, rectangularTriangle.calculateGround(25, 10));
    }

    @Test
    @DisplayName("Calculate RectangularTriangle Height")
    public void testCalculateHeight(){
        assertEquals(10, rectangularTriangle.calculateHeight(25, 5));
    }

    @Test
    @DisplayName("Calculate RectangularTriangle A")
    public void testCalculateA(){
        assertEquals(5, rectangularTriangle.calculateA(10, 11.180339887498949));
    }

    @Test
    @DisplayName("Calculate RectangularTriangle B")
    public void testCalculateB(){
        assertEquals(10, rectangularTriangle.calculateB(5, 11.180339887498949));
    }

    @Test
    @DisplayName("Calculate RectangularTriangle C")
    public void testCalculateC(){
        assertEquals(11.1803, rectangularTriangle.calculateC(5, 10));
    }

}
