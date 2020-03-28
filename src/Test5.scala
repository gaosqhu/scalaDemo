/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test5 extends App{
 println(
   """|"help" for me
      |thank you
      |    ok""".stripMargin)

  val tmp="格格，你好"
  println(s"hi,$tmp")

  println(1+2)
  println(1.+(2))
  println((2.0).unary_-)
  val tmp2="Hello World"
  println(tmp2 toLowerCase)
}
