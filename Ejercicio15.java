import java.util.Scanner;
/*
202030799 Manuel Rojas
Dise�ar un algoritmo que indique con carteles si el
n�mero ingresado es negativo, positivo o nulo.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();
        if (num == 0){
            System.out.println("El numero es nulo");
        }else if (num > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }  
    }  
}