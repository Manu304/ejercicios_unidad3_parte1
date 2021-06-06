//202030799 Manuel Rojas
//Diseñar un algoritmo que imprima con un cartel «Correcto» según el siguiente caso: si el número
//N es múltiplo de 5 y se encuentra entre los 25 primeros números. N debe ser obtenido
//aleatoriamente entre números del 1 al 1000. Primero debe mostrar N.
Proceso Ejercicio19
	random <- Aleatorio(1, 1000)
	Escribir random
	multiplo <- random%5
	Si (multiplo == 0) & (multiplo <= 25) Entonces
		Escribir "Correcto"
	FinSi
FinProceso