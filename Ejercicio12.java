import java.util.Scanner;

/*
202030799 Manuel Rojas
Diseñar un algoritmo que convierta y muestre la temperatura en 
Fahrenheit ingresando la temperatura en Celsius.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        double tempF, tempC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        tempC = scanner.nextDouble();
        tempF = (tempC*(1.8)) + 32.0;
        System.out.println("La temperatura en Fahrenheit es: " + tempF);   
    }   
}