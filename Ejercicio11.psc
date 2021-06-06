//202030799 Manuel Rojas
//Crear un algoritmo que convierta y muestre un
//valor ingresado en centímetros a yardas, metros, pies y pulgadas.
Proceso Ejercicio11
	Escribir "Ingrese una cantidad es centimetros para ser convertida"
	Leer centimetro
	metro <- (0.01)*centimetro
	yarda <- centimetro/(91.44)
	pulgada <- centimetro/(2.54)
	pie <- pulgada/12
	Escribir centimetro " cm equivale a: ", yarda, " yardas, ", metro, " metros, ", pie, " pies, ", pulgada, " pulgadas."
FinProceso
