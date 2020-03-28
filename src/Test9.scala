/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
class Test9 extends App {
  var i = 0
  var foundit = false
  while (i < args.length && !foundit) {
    if (!args(i).startsWith("_")) {
      if (args(i).endsWith(".scala")) {
        foundit = true
        println(args(i))
      }
    }
    i = i + 1
  }

  val a=1;
  {val a=2}
  println(a)

  def searchFrom(n:Int):Int={
    if(i>=args(0).length-1) -1
    else if(args(i).startsWith("-")) searchFrom(i+1)
    else if(args(i).endsWith(".scala")) i
    else searchFrom(i+1)
  }
  searchFrom(0)
}
