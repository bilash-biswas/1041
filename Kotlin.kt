import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextDouble()
    var b = read.nextDouble()
    if(a == 0.0 && b == 0.0)
    {
        println("Origem");
    }
    else if(a == 0.0 && b != 0.0)
    {
        println("Eixo Y");
    }
    else if(a != 0.0 && b == 0.0)
    {
        println("Eixo X");
    }
    else if(a > 0.0 && b > 0.0)
    {
        println("Q1");
    }
    else if(a < 0.0 && b > 0.0)
    {
        println("Q2");
    }
    else if(a < 0.0 && b < 0.0)
    {
        println("Q3");
    }
    else
    {
        println("Q4");
    }
}

    
