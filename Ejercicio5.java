import java.util.Scanner;
/*
202030799 Manuel Rojas
Dise�ar un algoritmo que pida un n�mero por teclado
y luego imprima el n�mero siguiente al ingresado.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int num, siguiente;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();
        siguiente = num + 1;
        System.out.println("El numero que le sigue a " + num + " es: " + siguiente); 
    }
}