import scala.collection.mutable.ListBuffer

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test23 extends App {
  val buf = new ListBuffer[Int];
  buf += 1
  buf += 2
  3 +=: buf
  buf.foreach(println)
}
