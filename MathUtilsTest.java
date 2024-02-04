import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    
    private MathUtils mathUtils;
    
    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }
    
    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-2, 1));
        assertEquals(0, mathUtils.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
        assertEquals(-3, mathUtils.subtract(0, 3));
        assertEquals(0, mathUtils.subtract(2, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(0, mathUtils.multiply(0, 5));
        assertEquals(-8, mathUtils.multiply(4, -2));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.001); // delta is used for double comparison
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001); // Should handle division by zero
        assertEquals(0.5, mathUtils.divide(1, 2), 0.001);
    }
}
