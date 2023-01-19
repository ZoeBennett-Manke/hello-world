package password_checker

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Password_Test extends AnyFunSpec with Matchers {
  describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters") {
        val tooShort = "abcde"
        val longEnough = "abcdef"
        val evenLonger = "abcdefghi"
        Password.isValid(tooShort) shouldBe false
        Password.isValid(longEnough) shouldBe true
        Password.isValid(evenLonger) shouldBe true
      }
      it("rejects passwords that do not include a special character") {
        val noCharacter = "abcdef"
        val specialCharacter = "abcdef!"
        Password.isValid(noCharacter) shouldBe false
        Password.isValid(specialCharacter) shouldBe true
      }
    }
  }

}
