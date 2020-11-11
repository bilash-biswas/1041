import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double a,b;
    a = input.nextDouble();
    b = input.nextDouble();
    if(a == 0.0 && b == 0.0)
    {
        System.out.printf("Origem\n");
    }
    else if(a == 0.0 && b != 0.0)
    {
        System.out.printf("Eixo Y\n");
    }
    else if(a != 0.0 && b == 0.0)
    {
        System.out.printf("Eixo X\n");
    }
    else if(a > 0.0 && b > 0.0)
    {
        System.out.printf("Q1\n");
    }
    else if(a < 0.0 && b > 0.0)
    {
        System.out.printf("Q2\n");
    }
    else if(a < 0.0 && b < 0.0)
    {
        System.out.printf("Q3\n");
    }
    else
    {
        System.out.printf("Q4\n");
    }
  }  
}
