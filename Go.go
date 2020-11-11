package main

import (
	"fmt"
)

func main() {
	var a, b float64
	fmt.Scan(&a)
	fmt.Scan(&b)
	if a == 0.0 && b == 0.0 {
		fmt.Printf("Origem\n")
	} else if a == 0.0 && b != 0.0 {
		fmt.Printf("Eixo Y\n")
	} else if a != 0.0 && b == 0.0 {
		fmt.Printf("Eixo X\n")
	} else if a > 0.0 && b > 0.0 {
		fmt.Printf("Q1\n")
	} else if a < 0.0 && b > 0.0 {
		fmt.Printf("Q2\n")
	} else if a < 0.0 && b < 0.0 {
		fmt.Printf("Q3\n")
	} else {
		fmt.Printf("Q4\n")
	}
}
