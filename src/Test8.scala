import java.io.{File, FileNotFoundException, FileReader}

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object Test8 extends App{
//var t=  for(i<-1 to 4 if i%2==0)   {
//  println(i)
//}
//  println(t)
  //for(i<-1 until 4) println(i)

//  var line =""
//  while((line=readLine())!="k"){
//    println(line)
//  }
//  val n=4
//  val half=if(n%2==0) n else throw new RuntimeException
//
//  try {
//    val f=new FileReader("dd")
//  }catch{
//    case ex:FileNotFoundException=>""
//    case ex:IndexOutOfBoundsException=>""
//  }

  val first="d"
  val da= first match {
    case "s" =>println("")
    case "d"=>"lkj"
    case _=>println("")
  }
println(da)
}
