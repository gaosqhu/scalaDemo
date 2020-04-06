/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test22 extends App {
  val l1 = List(1) :: List(2)
  for (tmp <- l1) println(tmp)

  val l2 = List(1) ::: List(2)
  //  println(l1)
  //  println(l2)


  println(append(List(1,2),List(3,4)))
  def append[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case x :: xs1 => x :: append(xs1, ys)
  }
}
