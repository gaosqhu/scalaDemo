/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test6 extends App {
  //  val tmp = if (args.isEmpty) "33" else args(0)
  //  println(tmp)

  def greet(): Unit = println("ddd")

  println(() == greet())

//  var line = ""
//  while ((line = readLine()) != "") {
//    println("line:" + line)
//  }

  val fileN=(new java.io.File(".")).listFiles();
  for(file<-fileN){
    println(file)
  }

  def gcdLoop(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while (a != 0) {
      val tmp = a
      a = b % a
      b = tmp
    }
    b
  }
}
