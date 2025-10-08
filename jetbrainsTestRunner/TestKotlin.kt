import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

/**
 * Playground JUnit 5 tests to demonstrate live streaming via TeamCity service messages.
 * Each test sleeps for a bit so you can observe the test tree updating in IntelliJ while running under Bazel.
 */
class TestKotlin {
  @Test
  @DisplayName("fast pass 1")
  fun fastPass1() {
    pause(300)
    Assertions.assertTrue(true)
  }

  @Test
  @DisplayName("slow pass 2")
  fun slowPass2() {
    pause(1200)
    Assertions.assertEquals(4, 1 + 3)
  }

//  @Test
//  @DisplayName("medium fail 3")
//  fun mediumFail3() {
//    pause(800)
//    Assertions.assertEquals("expected", "actual", "Intentional failure to showcase reporting")
//  }

  @Test
  @DisplayName("slow pass 4")
  fun slowPass4() {
    pause(1500)
    Assertions.assertNotNull("ok")
  }

 /* @Test
  @DisplayName("fast fail 5")
  fun fastFail5() {
    pause(200)
    Assertions.fail<Any?>("Deliberate failure (#5)")
  }*/

  @Test
  @DisplayName("pass with stdout 6")
  fun passWithStdout6() {
    println("[playground] Hello from test 6")
    pause(500)
    Assertions.assertTrue(3 > 2)
  }

  @Disabled("demonstrate ignored test")
  @Test
  @DisplayName("ignored 7")
  fun ignored7() {
    pause(400)
  }

  @RepeatedTest(3)
  @DisplayName("repeated test 8 (x3)")
  fun repeated8() {
    pause(300)
    Assertions.assertTrue(true)
  }

  @Nested
  @DisplayName("Nested group")
  internal inner class NestedGroup {
    @Test
    @DisplayName("nested pass 9")
    fun nestedPass9() {
      pause(600)
      Assertions.assertTrue(true)
    }

    /*@Test
    @DisplayName("nested fail 10")
    fun nestedFail10() {
      pause(700)
      Assertions.assertTrue(false, "Deliberate nested failure (#10)")
    }*/

    @Test
    @DisplayName("nested pass 11")
    fun nestedPass11() {
      pause(400)
      Assertions.assertEquals("ok", "ok")
    }
  }

  @Test
  @DisplayName("pass 12")
  fun pass12() {
    pause(500)
    Assertions.assertTrue(true)
  }

  @Test
  fun ` interesting#test `() {
    println("[playground] Hello from interesting test")
    pause(500)
    Assertions.assertTrue(3 > 2)
  }


  @ParameterizedTest
  @ValueSource(ints = [1, 3, 5, 15, Int.MAX_VALUE])
  fun isOddShouldReturnTrueForOddNumbers(number: Int) {
    Assertions.assertEquals(1, number % 2)
  }

  companion object {
    private fun pause(millis: Long) {
      try {
        println("[playground] Sleeping " + millis + " ms on " + Thread.currentThread().getName())
        Thread.sleep(millis)
      }
      catch (e: InterruptedException) {
        Thread.currentThread().interrupt()
        throw RuntimeException(e)
      }
    }
  }
}
