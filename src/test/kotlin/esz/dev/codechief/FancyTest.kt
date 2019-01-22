package esz.dev.codechief

import org.junit.Assert.*
import org.junit.Test

class FancyTest {
    @Test
    fun onlyNot() {
        assertEquals("Real Fancy", solve("not"))
    }

    @Test
    fun startsWithNot() {
        assertEquals("Real Fancy", solve("not already in"))
    }

    @Test
    fun endsWithNot() {
        assertEquals("Real Fancy", solve("is in not"))
    }

    @Test
    fun endsWithNotAndNewLine() {
        assertEquals("Real Fancy", solve("is in not\n"))
    }

    @Test
    fun notWithOtherWord() {
        assertEquals("regularly fancy", solve("a nothing is"))
    }

    @Test
    fun noNot() {
        assertEquals("regularly fancy", solve("some words here"))
    }
}
