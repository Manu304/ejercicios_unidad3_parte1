//202030799 Manuel Rojas
//Dise�ar un algoritmo que genere un n�meroaleatorio del 0 al 200, 
//lo muestre y luego calcule y muestre el mismo n�mero aumentado en un 30%.
Proceso Ejercicio6
	alea <- Aleatorio(0, 200)
	Escribir "El numero aleatorio generado es: ", alea
	aumentado <- (0.3*alea) + alea
	Escribir "El numero aleatorio aumentado es un 30% es: ", aumentado	
FinProceso
