import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PrimeFactorsTest {

    @Test
    fun factorOfOne() {
        assertEquals(emptyList(), PrimeFactors.generate(1))
    }


    @Test
    fun factorOfTwo() {
        assertEquals(listOf(2), PrimeFactors.generate(2))
    }

    @Test
    fun factorOfThree() {
        assertEquals(listOf(3), PrimeFactors.generate(3))
    }

    @Test
    fun factorOfFour() {
        assertEquals(listOf(2, 2), PrimeFactors.generate(4))
    }

    @Test
    fun factorOfEight() {
        assertEquals(listOf(2, 2, 2), PrimeFactors.generate(8))
    }

    @Test
    fun factorOfNine() {
        assertEquals(listOf(3, 3), PrimeFactors.generate(9))
    }

}