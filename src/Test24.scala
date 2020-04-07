/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test24 extends App {
  val t = findLongestWords("The quick brown fox".split(" "))
  println(t._1)
  println(t._2)
  val (k1, k2) = t
  println(k1)
  println(k2)

  def findLongestWords(arr: Array[String]) = {
    var word = arr(0)
    var idx = 0
    for (i <- 1 until arr.length) if (word.length < arr(i).length) {
      word = arr(i)
      idx = i
    }
    (word, idx)
  }
}
