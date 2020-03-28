/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object GcdTest extends App {
  val t = gcd1(12, 28)
  println(t)

  val k = gcd2(12, 28)
  println(k)

  def gcd1(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while (a != 0) {
      val tmp = a
      a = b % a
      b = tmp
    }
    b
  }

  def gcd2(a: Int, b: Int): Int = if (b == 0) a else gcd2(b, a % b)
}
