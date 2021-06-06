//202030799 Manuel Rojas
//Diseñar un algoritmo que calcule el volumen de
//un cilindro dados su radio y altura (primero el
//programa deberá verificar si son positivas).
Proceso Ejercicio13
	Escribir "Ingrese el radio del cilindro"
	Leer radio
	Escribir "Ingrese la altura del cilindro"
	Leer altura
	CONSTPI <- (3.14159265359)
	Si (radio >= 0) && (altura >= 0) Entonces
		vol <- CONSTPI*radio*radio*altura
		Escribir "El volumen del cilindro es: ", vol
	SiNo
		Escribir "Los valores a ingresar deben ser positivos"
	Fin Si
FinProceso