import scala.io.StdIn.readLine

@main def hello: Unit =
  println("Hello world!")
  println(msg)
  helloInteractive()

def helloInteractive() =
  print("Please enter your name: ")
  val name = readLine()
  println("Hello " + name +"!")

def msg = "I was compiled by Scala 3. :)"
