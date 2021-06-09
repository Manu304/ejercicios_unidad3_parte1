import java.util.Scanner;

/*
202030799 Manuel Rojas
Dise�ar un algoritmo que imprima el �rea y el
per�metro de un rect�ngulo ingresando su base y altura.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        double base, altura, perimetro, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = scanner.nextDouble();
        perimetro = (2*base) + (2*altura);
        area = base * altura;
        System.out.println("El area del rectangulo es: " + area + " unidades cuadradas" + ". Y su perimetro es: " + perimetro + " unidades lineales."); 
    }  
}