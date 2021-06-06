//202030799 Manuel Rojas
//Diseñar un algoritmo que genere un número aleatorio del 10 al 50, 
//lo muestre y luego calcule y muestre el mismo número disminuido en un 15%.
Proceso Ejercicio7
	alea <- Aleatorio(10, 50)
	Escribir "El numero aleatorio generado es: ", alea
	disminuido <- alea - (0.15*alea)
	Escribir "El numero aleatorio disminuido en un 15% es: ", disminuido	
FinProceso
	