//202030799 Manuel Rojas
//Dise�ar un algoritmo que imprima con un cartel �Correcto� seg�n el siguiente caso: si el n�mero
//N es m�ltiplo de 5 y se encuentra entre los 25 primeros n�meros. N debe ser obtenido
//aleatoriamente entre n�meros del 1 al 1000. Primero debe mostrar N.
Proceso Ejercicio19
	random <- Aleatorio(1, 1000)
	Escribir random
	multiplo <- random%5
	Si (multiplo == 0) & (multiplo <= 25) Entonces
		Escribir "Correcto"
	FinSi
FinProceso