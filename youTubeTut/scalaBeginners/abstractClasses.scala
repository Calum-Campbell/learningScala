import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)
  }//END OF MAIN

abstract class Mammal(val name: String){
  var moveSpeed : Double

  def move : String
}

class Wolf(name : String) extends Mammal(name){
  var moveSpeed = 35.0

  def move = "the wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
}

}











