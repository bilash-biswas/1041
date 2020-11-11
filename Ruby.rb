a,b = gets().chomp().split(' ');
a = a.to_f
b = b.to_f
if a == 0.0 && b == 0.0
    printf("Origem\n");
elsif a == 0.0 && b != 0.0
    printf("Eixo Y\n");
elsif a != 0.0 && b == 0.0
    printf("Eixo X\n");
elsif a > 0.0 && b > 0.0
    printf("Q1\n");
elsif a < 0.0 && b > 0.0
    printf("Q2\n");
elsif a < 0.0 && b < 0.0
    printf("Q3\n");
else
    printf("Q4\n");
end
