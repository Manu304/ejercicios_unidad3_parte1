import java.util.Scanner;

/*
202030799 Manuel Rojas
Diseñar un algoritmo que, dados tres n�meros
enteros, calcule e imprima el promedio entre ellos.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = scanner.nextInt();
        double promedio = (num1 + num2 + num3)/3;
        System.out.println("El promedio de los numeros ingresados es: " + promedio);  
    }
}
