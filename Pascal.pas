var
a, b :double;
begin
    read(a);
    read(b);
    if((a = 0.0) and (b = 0.0))then
        writeln('Origem')
    else if((a = 0.0) and (b <> 0.0))then
        writeln('Eixo Y')
    else if((a <> 0.0) and (b = 0.0))then
        writeln('Eixo X')
    else if((a > 0.0) and (b > 0.0))then
        writeln('Q1')
    else if((a < 0.0) and (b > 0.0))then
        writeln('Q2')
    else if((a < 0.0) and (b < 0.0))then
        writeln('Q3')
    else
        writeln('Q4')
end.
