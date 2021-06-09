import java.util.Scanner;

/*
202030799 Manuel Rojas
Crear un algoritmo que muestre por pantalla el doble 
y el triple de un n�mero ingresado por teclado.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();
        int doble = 2*num;
        int triple = 3*num;
        System.out.println("El doble del numero " + num + " es: " + doble + " y el triple es: " + triple);
    }
}