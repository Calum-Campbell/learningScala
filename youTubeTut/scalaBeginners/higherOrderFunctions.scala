import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){

    val log10Function = log10 _

    println(log10Function(1000))

    List(1000.0, 10000).map(log10Function).foreach(println)

//MAP WORKS BY APPLYING A FUNCTION TO EACH ELEMENT A LIST
    List(1,2,3,4,5).map((x:Int)=> x*50).foreach(println)
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

    def times3(num : Int) = num*3
    def times4(num : Int) = num*4

    def multInt(func : (Int) => Double, num : Int) = {
      func(num)
    }
    printf("4 * 100 = %.1f\n", multInt(times4, 100))

    val divisorVal = 5
    val divisor5 = (num : Double) => num / divisorVal

    println("5 /5 = "+ divisor5(5.0))

  }//END OF MAIN


}











