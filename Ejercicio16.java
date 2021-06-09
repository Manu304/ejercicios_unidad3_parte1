import java.util.Scanner;

/*
202030799 Manuel Rojas
Ingresar tres n�meros y mostrar el mayor (asuma que
todos son distintos entre s�).
*/
public class Ejercicio16 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres numeros diferentes: ");
        System.out.print("Primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Segundo numero: ");
        num2 = scanner.nextInt();
        System.out.print("Tercer numero: ");
        num3 = scanner.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("El numero mayor es: " + num1);
            }else{
                System.out.println("El numero mayor es: " + num3);
            }
        }else{
            if (num2 > num3){
                System.out.println("El numero mayor es: " + num2);
            }else{
                System.out.println("El numero mayor es: " + num3);
            }
        }
    } 
}