
object Main {
  def main(args:Array[String]){
    var Array(a,b) = scala.io.StdIn.readLine().split(" ").map(_.toDouble)
        if(a == 0.0 && b == 0.0)
    {
        println("Origem")
    }
    else if(a == 0.0 && b != 0.0)
    {
        println("Eixo Y")
    }
    else if(a != 0.0 && b == 0.0)
    {
        println("Eixo X")
    }
    else if(a > 0.0 && b > 0.0)
    {
        println("Q1")
    }
    else if(a < 0.0 && b > 0.0)
    {
        println("Q2")
    }
    else if(a < 0.0 && b < 0.0)
    {
        println("Q3")
    }
    else
    {
        println("Q4")
    }
  }
}
