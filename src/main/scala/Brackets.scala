import scala.collection.mutable

object Brackets {

  val myStack = mutable.Stack[Char]()

  def areBracketsMatched(s: String): Boolean = {
    s.foreach{c =>
      // check if order of brackets is correct
      c match {
        case '(' => myStack.push(c)
        case ')' if(myStack.top == '(') => myStack.pop

        case '[' => myStack.push(c)
        case ']' if(myStack.top == '[') => myStack.pop

        case '{' => myStack.push(c)
        case '}' if(myStack.top == '{') => myStack.pop

        case _ => return false
      }
    }
    myStack.isEmpty
  }
}
