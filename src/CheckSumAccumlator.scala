/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
class CheckSumAccumlator {

  private var sum=0

  def add(b:Byte):Int=sum+b
  def checkSum():Int= ~(sum & 0xFF)+1
}
