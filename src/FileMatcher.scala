

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
object FileMatcher extends App {
  private val filesHere = (new java.io.File(".")).listFiles()

  def filesEnding(query: String) = {
    for (file <- filesHere; if file.getName.endsWith(query)) yield file
  }

  def filesContaining(query: String) = {
    for (file <- filesHere; if file.getName.contains(query)) yield file
  }

  def fileRegex(query: String) = {
    for (file <- filesHere; if file.getName.matches(query)) yield file
  }

  //-----------------------------------------------------------//
  def fileMatch(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query)) yield file
  }

  def filesEnding2(query: String) = {
    fileMatch(query, (name, query) => name.endsWith(query))
  }

  def filesContaining2(query: String) = {
    fileMatch(query, (name, query) => name.contains(query))
  }

  def fileRgex2(query: String) = {
    fileMatch(query, (name, query) => name.matches(query))
  }

  //-----------------------------------------------------------//
  def filesEnding21(query: String) = {
    fileMatch(query, _.endsWith(_))
  }

  def filesContaining22(query: String) = {
    fileMatch(query, _.contains(_))
  }

  def fileRgex23(query: String) = {
    fileMatch(query, _.matches(_))
  }

  //-----------------------------------------------------------//
  def fileMatch2(query: String, matcher: (String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName)) yield file
  }

  def fileEnding3(query: String) = {
    fileMatch2(query, name => name.endsWith(query))
  }

  def filesContaining3(query: String) = {
    fileMatch2(query, name => name.contains(query))
  }

  def fileRgex3(query: String) = {
    fileMatch2(query, name => name.matches(query))
  }

  //-----------------------------------------------------------//

  def fileEnding4(query: String) = {
    fileMatch2(query, _.endsWith(query))
  }

  def filesContaining4(query: String) = {
    fileMatch2(query, _.contains(query))
  }

  def fileRgex4(query: String) = {
    fileMatch2(query, _.matches(query))
  }
}
