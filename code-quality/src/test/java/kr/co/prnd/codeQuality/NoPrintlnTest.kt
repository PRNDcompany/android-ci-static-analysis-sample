package kr.co.prnd.codeQuality

import io.gitlab.arturbosch.detekt.test.lint
import org.junit.Test

class NoPrintlnTest {

    @Test
    fun `println 함수 호출이 있으면, 경고한다`() {
        // given
        val rule = NoPrintln()
        val code = """
            fun main() {
                println("Test")
            }
        """.trimIndent()

        // when
        val actual = rule.lint(code).first()

        // then
        assert(actual.id == "NoPrintln")
    }

    @Test
    fun `println 함수 호출이 없으면, 경고하지 않는다`() {
        // given
        val rule = NoPrintln()
        val code = """
            fun main() {
                doSomething()
            }
        """.trimIndent()

        // when
        val actual = rule.lint(code).firstOrNull()

        // then
        assert(actual == null)
    }
}
