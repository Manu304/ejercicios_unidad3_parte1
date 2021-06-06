//202030799 Manuel Rojas
//Ingresar tres números y mostrar el mayor (asuma que
//todos son distintos entre sí).
Proceso Ejercicio16
	Escribir "Ingrese tres numeros diferentes"
	Leer num1, num2, num3
	Si num1 > num2 Entonces
		Si num1 > 3 Entonces
			Escribir "El numero mayor es: ", num1
		SiNo
			Escribir "El numero mayor es: ", num3
		FinSi
	SiNo
		Si num2 > num3 Entonces
			Escribir "El numero mayor es: ", num2
		SiNo
			Escribir "El numero mayor es: ", num3
		FinSi
	FinSi
FinProceso