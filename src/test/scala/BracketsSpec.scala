import org.scalatest._
import flatspec._
import matchers._
import Brackets._

class BracketsSpec extends AnyFlatSpec with should.Matchers {

  "areBracketsMatched()" should "return false for string with unmatched brackets" in {

    areBracketsMatched("([)]") shouldBe false
    areBracketsMatched("[}") shouldBe false
    areBracketsMatched("Hello") shouldBe false
  }

  "areBracketsMatched()" should "return true for string with matched brackets" in {

    areBracketsMatched("[]") shouldBe true
    areBracketsMatched("[{()}]") shouldBe true
    areBracketsMatched("({[]})") shouldBe true
    areBracketsMatched("(({}))") shouldBe true
  }
}