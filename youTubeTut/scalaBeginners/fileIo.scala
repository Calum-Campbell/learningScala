import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){

    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\n Some more random text")
    writer.close()

    val texFromFile = Source.fromFile("test.txt", "UTF-8")

    val lineIterator = texFromFile.getLines

    for(line <- lineIterator)
    println(line)
    texFromFile.close()

  }//END OF MAIN


}











