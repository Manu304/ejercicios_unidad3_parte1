//202030799 Manuel Rojas
//Crear un algoritmo que calcule si dos n�meros son
//divisibles. Para ello, se piden un primer n�mero y un
//segundo n�mero, entonces mostrar un cartel que diga
//"es divisible" si el segundo n�mero es divisible al primero.
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