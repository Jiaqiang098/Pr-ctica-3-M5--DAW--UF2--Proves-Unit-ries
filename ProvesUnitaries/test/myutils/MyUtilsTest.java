package myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyUtilsTest {

    public MyUtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInverteix() {
        assertEquals("odnum aloH", MyUtils.inverteix("Hola mundo"));
        assertNull(MyUtils.inverteix(null));
        assertEquals("", MyUtils.inverteix(""));
    }

     @Test
    public void testEdat() {
        assertTrue(MyUtils.edat(1, 1, 2000) > 0);
        assertEquals(-2, MyUtils.edat(1, 1, 3000));
        assertEquals(-1, MyUtils.edat(1, 1, 1800));
    }

    @Test
    public void testFactorial() {
        assertEquals(120.0, MyUtils.factorial(5), 0.001);
        assertEquals(-1.0, MyUtils.factorial(-5), 0.001);
        assertEquals(3628800.0, MyUtils.factorial(10), 0.001);
    }

}
