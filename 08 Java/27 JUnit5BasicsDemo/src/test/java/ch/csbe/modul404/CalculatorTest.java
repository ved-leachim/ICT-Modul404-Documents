package ch.csbe.modul404;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void firstInit() {
        System.out.println("This runs at the very beginning.");
    }

    @AfterEach
    void takeDown() {
        System.out.println("Runs after each Teste Method.");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing Addition Functionality")
    @Tag("Math")
    public void testAdd(){
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    @DisplayName("Testing Multiply Functionality")
    @Tag("Math")
    public void testMultiply(){
        boolean serverReachable = false;
        assumeTrue(serverReachable);
        assertEquals(6, calculator.multiply(2,3));
    }
}
