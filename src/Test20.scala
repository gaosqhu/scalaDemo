/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test20 extends App {
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
  val x1 = show(capitals get "France")
  println(x1)

  val x2 = show(capitals get "Fra2nce")
  println(x2)

  def show(x: Option[String]) = x match {
    case Some(x) => x
    case None => "?"
  }

}
