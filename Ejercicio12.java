import java.util.Scanner;

/*
202030799 Manuel Rojas
Dise�ar un algoritmo que convierta y muestre la temperatura en 
Fahrenheit ingresando la temperatura en Celsius.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        double tempF, tempC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        tempC = scanner.nextDouble();
        tempF = (tempC*(9/5)) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + tempF);   
    }   
}