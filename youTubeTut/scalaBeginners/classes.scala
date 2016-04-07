import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main( args: Array[String]){

    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers = new Animal("whiskers", "Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.sound}")
    println(whiskers.toString)

    val spike = new Dog("Spike", "woof", "grrrrr")
    // spike.setName("spike1")
    println(spike.toString)
  }//END OF MAIN

  class Animal(var name:String, var sound: String){
    this.setName(name)

    val id = Animal.newIdNum//this is called below in matching object to give an idNumumber

    def getName() : String = name
    def getSound() : String = sound

    def setName(name : String){
      if(!(name.matches(".*\\d+.*")))
      this.name = name
      else
      this.name = "No Name"
    }

    def setSound(sound: String){
      this.sound = sound
    }

//IF YOU ONLY PASS IN A NAME NOT A SOUND
    def this(name: String){
      this("No Name", "No Sound")
      this.setName(name)
    }
//IF YOU DONT PASS NAME  OR SOUND
    def this(){
      this("No Name", "No Sound")
    }

    override def toString() : String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  object Animal {
    private var idNumber = 0 
    private def newIdNum = { idNumber +=1; idNumber}
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound){
    //if get two values
    def this(name: String, sound: String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this(name: String){
      this("no name", "no sound", "no growl")
      this.setName(name)
    }

    def this(){
      this("no name", "no sound", "no growl")
    }

    override def toString(): String = {
      return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
  }

}









