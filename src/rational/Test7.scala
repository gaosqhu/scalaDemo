package rational

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test7 extends App {
  val t1 = new RationalNew(2, 5)
  println(t1 * 2)
  val t2 = new RationalNew(2)
  var t3 = t2 * t1
  println(new RationalNew(2) * t1)

  implicit def intToRational(x: Int): RationalNew = new RationalNew(x)
  println(2 * t1)
}
