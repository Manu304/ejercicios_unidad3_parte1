//202030799 Manuel Rojas
//Realice un algoritmo para mostrar un cartel que
//indique si un tri�ngulo es �escaleno�, �equil�tero� o
//�is�sceles� ingresando sus lados.
Proceso Ejercicio17
	Escribir "Ingrese los valores de los lados del triangulo"
	Leer lado1, lado2, lado3
	Si (lado1 == lado2) & (lado1 == lado3) Entonces
		Escribir "El triangulo es Equilatero"
	SiNo
		Si (lado1 == lado2) | (lado1 == lado3) Entonces
			Escribir "El triangulo es Isosceles"
		SiNo
			Escribir "El triangulo es Escaleno"
		FinSi
	FinSi
FinProceso