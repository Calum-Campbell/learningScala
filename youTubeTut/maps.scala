import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){

    val employees = Map("Manager" -> "Bob Smith", "Secretary"->"Sue Brown")
    if(employees.contains("Manager"))
    printf("Manager: %s \n", employees("Manager"))
  }

  val customers = collection.mutable.Map(100 ->"Paul Smith", 101 ->"Sally Smith")

  printf("Cust 1 : %s\n", customers(100))

  customers(100) = "Tom Marks"

  customers(102) = "Megan Swift"

  for((k,v) <- customers)
  printf("%d : %s \n", k,v)
}