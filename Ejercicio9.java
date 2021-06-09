import java.util.Scanner;

/*
202030799 Manuel Rojas
Dise�e un algoritmo para ingresar dos palabras
(A, B) y luego realice el intercambio de sus
valores. Finalmente mostrar el contenido de A y de B.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        String palabraA, palabraB, palabraC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        palabraA = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        palabraB = scanner.nextLine();
        palabraC = palabraA;
        palabraA = palabraB;
        palabraB = palabraC;
        System.out.println("Ahora la palabra A es igual a: " + palabraA + " y la palabra B es igual a: " + palabraB);
    }
}