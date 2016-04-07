import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){
  
    val favNums = new Array[Int](20)

    val friends = Array("bob", "tom")

    friends(0) = "sue"

    val friends2 = ArrayBuffer[String]()

    friends2.insert(0,"Phil")
    friends2 += "Mark"
    friends2 ++= Array("susy", "Paul")
    friends2.insert(1,"Mike", "Sally","sam")
    friends2.remove(1,2)

    var friend : String = ""

    for(friend <- friends2)
    println(friend)

    for (j <- 0 to (favNums.length - 1)){
      favNums(j) = j
      println(favNums(j))
    }
    val favNumsTimes2 = for(num <- favNums) yield 2*num
    
    favNumsTimes2.foreach(println)

    var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num

    favNumsDiv4.foreach(println)

    var multTable = Array.ofDim[Int](10,10)
    for(i <- 0 to 9){
      for(j <- 0 to 9){
        multTable(i)(j) = i*j
      }
    }
    for(i <- 0 to 9){
      for(j <- 0 to 9){
        printf("%d : %d = %d\n", i,j,multTable(i)(j))
      }
    }
    println("Sum : "+favNums.sum)
    println("min : "+favNums.min)
    println("Max : "+favNums.max)

    val sortedNums = favNums.sortWith(_<_)

    println(sortedNums.deep.mkString(", "))


  }


}











