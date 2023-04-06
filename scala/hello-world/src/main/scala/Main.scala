import scala.io.StdIn.readLine

@main def hello: Unit =
  println("Hello world!")
  println(msg)
  helloInteractive()

  val firstname = "Madhur"
  val mi = 'R'
  val lastname = "M"

  println(s"Name: $lastname $mi $firstname")

def helloInteractive() =
  print("Please enter your name: ")
  val name = readLine()
  println("Hello " + name +"!")

def msg = "I was compiled by Scala 3. :)"
