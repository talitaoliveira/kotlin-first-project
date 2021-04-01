import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun shouldMultiplyBy2() {
        val calculator = Calculator()
        val result = calculator.double(5)
        assertEquals(10, result)
    }
}