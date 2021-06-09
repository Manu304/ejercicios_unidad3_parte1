import java.util.Scanner;

/*
202030799 Manuel Rojas
Dise�ar un algoritmo que ingresando un n�mero
de 5 d�gitos detecte si es capic�a y muestre un
cartel �Es capic�a� o �No es capic�a
*/
public class Ejercicio20 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero de cinco cifras positivas: ");
        num = scanner.nextInt();
        if((num >= 10000) && (num <= 99999)){
            String numero = Integer.toString(num);
            char[] digitos = numero.toCharArray();

            if((digitos[0] == digitos[4]) && (digitos[1] == digitos[3])){
                System.out.println("Es capicua");
            }else{
                System.out.println("No es capicua");
            }
        }
    } 
}