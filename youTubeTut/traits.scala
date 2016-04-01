import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){

    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))

  }//END OF MAIN

  trait Flyable {
    def fly : String
  }

  trait BulletProof {
    def hitByBullet : String

    def ricochet(startSpeed : Double) : String = {
      "The Bullet ricochets at a speed of %.1f ft/sec".format(startSpeed*.75)
    }
  }

  class Superhero(val name: String) extends Flyable with BulletProof{
    def fly = "%s flys through the air".format(this.name)
    def hitByBullet = "The bullet bounces of %s ". format(this.name)
  }
}











