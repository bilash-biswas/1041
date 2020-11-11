a = io.read("*n")
b = io.read("*n")
if(a == 0.0 and b == 0.0) then
    print("Origem")
elseif(a == 0.0 and b ~= 0.0) then
    print("Eixo Y")
elseif(a ~= 0.0 and b == 0.0) then
    print("Eixo X")
elseif(a > 0.0 and b > 0.0) then
    print("Q1")
elseif(a < 0.0 and b > 0.0) then
    print("Q2")
elseif(a < 0.0 and b < 0.0) then
    print("Q3")
else
    print("Q4")
end
