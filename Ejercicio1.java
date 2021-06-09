import java.util.Scanner;

/*
202030799 Manuel Rojas
Diseniar un algoritmo que, dados dos numeros, muestre por pantalla su suma.
*/
public class Ejercicio1{
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es: " + suma); 
    }
}