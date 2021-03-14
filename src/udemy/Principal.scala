package udemy

object Principal extends App {
  class Writer (firstName: String, surname: String, val birthYear: Int){
    val fullName: String = f"$firstName $surname"
  }
  class Novel (name: String, author: Writer, releaseYear: Int){
    val authorAge: Int = author.birthYear
    val isWrittenBy: String = author.fullName
    def copy (newReleaseYear: Int): Novel ={
      new Novel(name, author, newReleaseYear)
    }
  }
  class Counter (count:Int){
    val currentCount: Int = count
    def increment = new Counter(count+1)
    def decrement = new Counter(count-1)
    def increment(amount: Int) = new Counter(count+amount)
    def decrement(amount: Int) = new Counter(count-amount)

  }
//  val caio = new Writer("caio", "reis", 1989)
//  val counter = new Counter(10)

  class Person(val name:String, favoriteMovie:String, val age: Int=0){
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_+(): Person = new Person(name, favoriteMovie, age+1)
    def learns(subject: String): String = s"$name is learning $subject"
    def learnsScala : String = learns("Scala")
    def apply(watchTime: Int): String = s"$name whatced $favoriteMovie $watchTime times"
  }
  val caio = new Person("Caio", "O Auto da Compadecida", 31)
  println(caio + "Caíto" name)
  println(+caio age)
  println(caio learnsScala)
  println(caio(9))
}
