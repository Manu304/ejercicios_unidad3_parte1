import java.util.Scanner;

/*
202030799 Manuel Rojas
Realice un algoritmo para mostrar un cartel que
indique si un tri�ngulo es �escaleno�, �equil�tero� o
�is�sceles� ingresando sus lados.
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los lados del triangulo: ");
        System.out.print("Primer lado: ");
        lado1 = scanner.nextInt();
        System.out.print("Segundo lado: ");
        lado2 = scanner.nextInt();
        System.out.print("Tercer lado: ");
        lado3 = scanner.nextInt();
        if ((lado1 == lado2) & (lado1 == lado3)){
            System.out.println("El triangulo es Equilatero");
        }else if ((lado1 == lado2) | (lado1 == lado3)){
            System.out.println("El triangulo es Isosceles");
        }else{
            System.out.println("El triangulo es Escaleno");
        } 
    } 
}