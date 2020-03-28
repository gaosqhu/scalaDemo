import scala.io.Source

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
class Test10 {

  def processFile(fileName: String, width: Int) = {
    def processLine(fileName: String, width: Int, line: String) = {
      if (line.length > width) {
        println(fileName + ":" + line.trim)
      }
    }

    val source = Source.fromFile(fileName);
    for (line <- source.getLines()) {
      processLine(fileName, width, line)
    }
  }

  def processFile2(fileName: String, width: Int) = {
    def processLine(line: String) = {
      if (line.length > width) {
        println(fileName + ":" + line.trim)
      }
    }

    val source = Source.fromFile(fileName);
    for (line <- source.getLines()) {
      processLine(line)
    }
  }
}
