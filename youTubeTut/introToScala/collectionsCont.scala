case class Person(age:Int) 

  val person = Option(Person(100))

  val age = person.map(_.age +5)

  age.getOrElse(0)

  val person2:Option[Person]= Option(null)

  val age2 = person2.map(_.age + 5)

  age2.getOrElse(0)

  def doStuff(p: Option[Person]) = p match{
    case Some(person) => println("Here is " + person)
    case None => println("no person")
  }

doStuff(person)

doStuff(person2)


