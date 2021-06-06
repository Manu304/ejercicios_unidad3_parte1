//202030799 Manuel Rojas
//Crear un algoritmo que calcule si dos números son
//divisibles. Para ello, se piden un primer número y un
//segundo número, entonces mostrar un cartel que diga
//"es divisible" si el segundo número es divisible al primero.
Proceso Ejercicio14
	Escribir "Ingrese dos valores"
	Leer num1, num2
	residuo = num1%num2
	Si residuo == 0
		Escribir "Es divisible"
	SiNo
		Escribir "No es divisible"
	FinSi
FinProceso