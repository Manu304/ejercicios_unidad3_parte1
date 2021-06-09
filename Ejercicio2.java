import java.util.Scanner;

/*
202030799 Manuel Rojas
Realice un algoritmo que solicite dos datos: pais y capital.
Y luego muestre la capital del pais
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de un pais: ");
        String pais = scanner.nextLine();
        System.out.print("Ingrese la capital del pais que ingreso: ");
        String capital = scanner.nextLine();
        System.out.println(capital + " es la capital de " + pais);
    }
}