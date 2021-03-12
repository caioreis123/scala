package udemy

object Principal extends App {
  println("olá, scala!")
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
  val caio = new Writer("caio", "reis", 1989)
  println(caio.fullName)
  val counter = new Counter(10)
  println(counter.decrement.currentCount)
  println(counter.currentCount)
  println(counter.increment(10).currentCount)

}
