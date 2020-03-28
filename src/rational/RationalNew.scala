package rational

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
class RationalNew(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  var number = n / g
  var denom = d / g

  def this(n: Int) = this(n, 1)

  def +(that: RationalNew): RationalNew = new RationalNew(number * that.denom + denom * that.number, denom * that.denom)

  def +(a: Int): RationalNew = new RationalNew(number + a * denom, denom)

  def -(that: RationalNew): RationalNew = new RationalNew(number * that.denom - that.number * denom, denom * that.denom)

  def -(a: Int): RationalNew = new RationalNew(number - a * denom, denom)

  def *(that: RationalNew): RationalNew = new RationalNew(number * that.number, denom * that.denom)

  def *(a: Int): RationalNew = new RationalNew(number * a, denom)

  def /(that: RationalNew): RationalNew = new RationalNew(number * that.denom, denom * that.number)

  def /(a: Int): RationalNew = new RationalNew(number, denom * a)

  override def toString: String = n + "/" + d

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
