import java.util.Scanner;

/*
202030799 Manuel Rojas
Realice un algoritmo que solicite dos datos: pais y capital.
Y luego muestre la capital del pais
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pais;
        String capital;
        System.out.print("Ingrese el nombre de un pais: ");
        pais = scanner.nextLine();
        capital = scanner.nextLine();
        System.out.println(capital + " es la capital de " + pais);
    }
}