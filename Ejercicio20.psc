//202030799 Manuel Rojas
//Diseñar un algoritmo que ingresando un número
//de 5 dígitos detecte si es capicúa y muestre un
//cartel «Es capicúa» o «No es capicúa
Proceso Ejercicio20
	Escribir "Ingrese un numero de cinco cifras positivas"
	Leer num
	Si (num >= 10000) & (num <= 99999) Entonces
		d1 <- Subcadena(Convertiratexto(num), 1, 1)
		d2 <- Subcadena(Convertiratexto(num), 2, 2)
		d3 <- Subcadena(Convertiratexto(num), 3, 3)
		d4 <- Subcadena(Convertiratexto(num), 4, 4)
		d5 <- Subcadena(Convertiratexto(num), 5, 5)
		
		Si (d1 == d5) & (d2 == d4) Entonces
			Escribir "Es capicua"
		SiNo
			Escribir "No es capicua"
		FinSi

	SiNo
		Escribir "El numero ingresado no es de cinco cifras positivas"
	FinSi
FinProceso