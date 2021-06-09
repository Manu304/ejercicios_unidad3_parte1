import java.util.Scanner;

/*
202030799 Manuel Rojas
Dise�ar un algoritmo que calcule el volumen de
un cilindro dados su radio y altura (primero el
programa deber� verificar si son positivas).
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        double CONSTPI = 3.1416, radio, altura;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro: ");
        radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        altura = scanner.nextDouble();
        if ((radio >= 0) && (altura >= 0)){
            double vol = CONSTPI*radio*radio*altura;
            System.out.println("El volumen del cilindro es: " + vol);
        }else{
            System.out.println("Los valores a ingresar deben ser positivos");
        }
    } 
}