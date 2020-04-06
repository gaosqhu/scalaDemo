import scala.collection.mutable
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

  def hasUpperCase(s: String) = s.exists(_.isUpper)

  println(hasUpperCase("dddffUdos"))

  def countWords(s: String) = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWord <- s.split("[ ,!.]+")) {
      val word = rawWord toLowerCase
      val oldCount = if (counts.contains(word)) counts(word) else 0
      counts += (word -> (oldCount + 1))
    }
    counts
  }

  println(countWords("See Spot run! Run Spot. Run!"))

  //----------------------------------------//
  val nums = Map("i" -> 1, "k" -> 2)
  nums + ("h" -> 8)
  nums - "i"
  println(nums)

  val num2 = mutable.Map("i" -> 1, "k" -> 2)
  num2 += ("h" -> 3)
  println(num2)
}
