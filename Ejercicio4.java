import java.util.Scanner;
/*
202030799 Manuel Rojas
Dise�ar un algoritmo que imprima el cuadrado y
el cubo de un n�mero ingresado por teclado
*/
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un numero: ");
		num = scanner.nextInt();
		int cuboNum = num*num*num;
		int cuadradoNum = num*num;
		System.out.println("El cuadrado del numero " + num + " es: " + cuadradoNum + ". El cubo de " + num + " es: " + cuboNum);
	}
}

