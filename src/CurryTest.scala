

import java.io.PrintWriter

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object CurryTest extends App {
  withPrintWriter(".", _.println(new java.util.Date))

  def withPrintWriter(file: String, op: PrintWriter => Unit) = {
    val writer = new PrintWriter(".")
    try {
      op(writer)
    } finally {
      writer close
    }
  }

  //-----------------------------//
  // withPrintWriter2(".")(_.println(new java.util.Date))
  withPrintWriter2(".") {
    _.println(new java.util.Date)
  }

  def withPrintWriter2(file: String)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(".")
    try {
      op(writer)
    } finally {
      writer close
    }
  }

}
