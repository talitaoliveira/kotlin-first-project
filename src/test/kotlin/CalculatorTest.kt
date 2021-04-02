import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CalculatorTest {

    @Test
    fun shouldMultiplyBy2() {
        val calculator = Calculator()
        val result = calculator.double(5)
        assertEquals(10, result)
    }

    @Test
    fun shouldDivideBy2() {
        val calculator = Calculator()
        val result = calculator.half(10)
        assertEquals(5, result)
    }

    @Test
    fun shouldSumNumbers() {
        val calculator = Calculator()
        val numbers = arrayOf(1,2,3,4,5)
        val result = calculator.sum(numbers)
        assertEquals(15, result)
    }
}