import org.junit.jupiter.api.Test
import io.kotest.matchers.shouldBe

class SimpleKotlinTestChanged {
    @Test
    fun `trivial test`() {
        1+1 shouldBe 2
    }
    @Test
    fun `another trivial test`() {
        val a = 1
        val b = 2
        print(a + b)
        print(a - b)
        1+2 shouldBe 3
    }
}