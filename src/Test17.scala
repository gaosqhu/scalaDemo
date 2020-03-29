/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test17 extends App {
  val assertionEnabled = true

  def myAssert(predicate: () => Boolean) = {
    if (assertionEnabled && !predicate()) {
      throw new AssertionError()
    }
  }

  myAssert(() => 5 > 3)

  //-----------------------------//
  def myAssert2(predicate: => Boolean) = {
    if (assertionEnabled && !predicate) {
      throw new AssertionError()
    }
  }
  myAssert2(5 > 3)
}
