import java.util.Scanner;

/*
202030799 Manuel Rojas
Crear un algoritmo que convierta y muestre un
valor ingresado en cent�metros a yardas + metros + pies y pulgadas.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        double centimetro, metro, yarda, pulgada, pie;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en centimetros para ser convertida: ");
        centimetro = scanner.nextDouble();
        metro = ((0.01)*centimetro);
	    yarda = (centimetro/(91.44));
	    pulgada = (centimetro/(2.54));
	    pie = (pulgada/12);
        System.out.println(centimetro + " cm equivale a: " + yarda + " yardas + " + metro + " metros + " + pie + " pies + " + pulgada + " pulgadas.");
    }
}