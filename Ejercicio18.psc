//202030799 Manuel Rojas
//Crear un algoritmo que muestre cada uno de los d�gitos de un n�mero ingresado por el usuario.
//El m�ximo permitido es de 4 d�gitos. Al final debe mostrar la suma de los d�gitos.
//Por ejemplo: si se ingresa el n�mero 187, entonces debe mostrar en un �nico cartel lo siguiente:
//"d1 = 0, d2 = 1, d3 = 8 y d4 =7. suma= 16".
Proceso Ejercicio18
	Escribir "Ingrese un numero"
	Leer num
	Si (num >= 0) & (num <= 9999) Entonces
		Si num <= 9999 Entonces
			d1 <- Subcadena(Convertiratexto(num), 1, 1)
			d2 <- Subcadena(Convertiratexto(num), 2, 2)
			d3 <- Subcadena(Convertiratexto(num), 3, 3)
			d4 <- Subcadena(Convertiratexto(num), 4, 4)
		FinSi
		
		Si num <= 999 Entonces
			d1 <- "0"
			d2 <- Subcadena(Convertiratexto(num), 1, 1)
			d3 <- Subcadena(Convertiratexto(num), 2, 2)
			d4 <- Subcadena(Convertiratexto(num), 3, 3)
			
		FinSi
		
		Si num <= 99 Entonces
			d1 <- "0"
			d2 <- "0"
			d3 <- Subcadena(Convertiratexto(num), 1, 1)
			d4 <- Subcadena(Convertiratexto(num), 2, 2)
		FinSi
		
		Si num <= 9 Entonces
			d1 <- "0"
			d2 <- "0"
			d3 <- "0"
			d4 <- Subcadena(Convertiratexto(num), 1, 1)
			
		FinSi
		
		Si num == 0 Entonces
			d1 <- "0"
			d2 <- "0"
			d3 <- "0"
			d4 <- "0"
		FinSi
		suma <- ConvertirANumero(d1) + ConvertirANumero(d2) + ConvertirANumero(d3) + ConvertirANumero(d4)
		Escribir "d1 = ", d1, " d2 = ", d2, " d3 = ", d3, " d4 = ", d4, ". Suma = ", suma
	SiNo
		Escribir "Ingrese un numero no mayor a 4 cifras positivas"
		
	FinSi
FinProceso