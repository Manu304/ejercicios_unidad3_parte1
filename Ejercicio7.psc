//202030799 Manuel Rojas
//Dise�ar un algoritmo que genere un n�mero aleatorio del 10 al 50, 
//lo muestre y luego calcule y muestre el mismo n�mero disminuido en un 15%.
Proceso Ejercicio7
	alea <- Aleatorio(10, 50)
	Escribir "El numero aleatorio generado es: ", alea
	disminuido <- alea - (0.15*alea)
	Escribir "El numero aleatorio disminuido en un 15% es: ", disminuido	
FinProceso
	