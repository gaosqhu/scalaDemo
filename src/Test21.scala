/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test21 extends App {

  val l = List(2, 4, 1, 3, 7)
  val sortL = issort2(l)
  println(sortL)

  def issort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) Nil else insert(xs.head, issort(xs.tail))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = {
    if (xs.isEmpty || x <= xs.head) x :: xs else xs.head :: insert(x, xs.tail)
  }

  //-----------------------------------------------------------------//
  def issort2(xs: List[Int]): List[Int] = xs match {
    case Nil => List()
    case x :: xs1 => insert2(x, issort2(xs1))
  }

  def insert2(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }
}
