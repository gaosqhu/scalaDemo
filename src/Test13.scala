/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test13 extends App {
  echo()
  echo("aa", "4")

  val arr=Array("bb","cc","dd")
  echo(arr:_*)

  def echo(args: String*) = {
    args.foreach(println)
  }
}
