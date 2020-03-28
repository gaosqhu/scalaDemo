package rational

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
// */
class Rational(n: Int, d: Int) {
  require((d != 0))


  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  //def this(n: Int) = this(n, 1)

  def add(that: Rational): Rational = new Rational(number * that.denom + denom * that.number, denom * that.denom)

  def +(that: Rational): Rational = new Rational(number * that.denom + denom * that.number, denom * that.denom)

  def *(that: Rational): Rational = new Rational(number * that.number, denom * that.denom)

  def lessThan(that: Rational): Boolean = number * that.denom < that.number * denom

  def max(that: Rational): Rational = if (lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = {
    println("success")
    1
  }

  override def toString: String = number + "/" + denom

  //def add():Rational=new Rational(n+1,d+8)
}