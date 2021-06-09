import java.util.Scanner;

/*
202030799 Manuel Rojas
Crear un algoritmo que calcule si dos n�meros son
divisibles. Para ello, se piden un primer n�mero y un
segundo n�mero, entonces mostrar un cartel que diga
"es divisible" si el segundo n�mero es divisible al primero.
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        int num1, num2, residuo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = scanner.nextInt();
        residuo = num1%num2;
        if (residuo == 0){
            System.out.println("Es divisible");
        }else{
            System.out.println("No es divisible");
        }
    }
}