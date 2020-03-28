/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test11 extends App {

  var tmp = List("2", "63", "14")
 // tmp.foreach(x => println(x))
  tmp.foreach(println _)

  tmp.filter(x => x.length > 0)
  tmp.filter(_.length>0)
}
