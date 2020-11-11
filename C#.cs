using System.IO;
using System;

class Program
{
    static void Main()
    {
        double a,b;
        var p = Console.ReadLine().Split();
        a = double.Parse(p[0]);
        b = double.Parse(p[1]);
    if(a == 0.0 && b == 0.0)
    {
        Console.WriteLine("Origem");
    }
    else if(a == 0.0 && b != 0.0)
    {
        Console.WriteLine("Eixo Y");
    }
    else if(a != 0.0 && b == 0.0)
    {
        Console.WriteLine("Eixo X");
    }
    else if(a > 0.0 && b > 0.0)
    {
        Console.WriteLine("Q1");
    }
    else if(a < 0.0 && b > 0.0)
    {
        Console.WriteLine("Q2");
    }
    else if(a < 0.0 && b < 0.0)
    {
        Console.WriteLine("Q3");
    }
    else
    {
        Console.WriteLine("Q4");
    }
  }
}
