/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test19 extends App {
  val x = describe(5)
  println(x)

  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi"
    case Nil => "the empty list"
    case _ => "something esle"
  }

  def describe2(x: Any) = x match {
    case 0 => "zero"
      case somethingElse => ""

  }
}
