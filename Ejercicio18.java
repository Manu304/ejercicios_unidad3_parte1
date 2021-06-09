import java.util.Scanner;

/*
202030799 Manuel Rojas
Crear un algoritmo que muestre cada uno de los d�gitos de un n�mero ingresado por el usuario.
El m�ximo permitido es de 4 d�gitos. Al final debe mostrar la suma de los d�gitos.
Por ejemplo: si se ingresa el n�mero 187, entonces debe mostrar en un �nico cartel lo siguiente:
"d1 = 0, d2 = 1, d3 = 8 y d4 =7. suma= 16".
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero no mayor a 4 cifras positivas: ");
        num = scanner.nextInt();
        if((num >= 0) && (num <= 9999)){
            String numero = Integer.toString(num);
            int digito = numero.length();
            char[] digitosSacados = {0,0,0,0};
            
            if(digito > 0){
                char[] digitos = numero.toCharArray();
                for(int i = 0; i < digito; i++){
                    digitosSacados[i+(4-digito)] = digitos[i];
                }
            }
            int suma = 0;
            for(int i=0; i<4; i++){
                suma =+ Integer.valueOf(digitosSacados[i]);
            }
            for (int i=1; i <=4; i++){
                System.out.print("d" + i + " = " + digitosSacados[i] + ", ");
            }
            System.out.print("suma = " + suma);

        }else{
            System.out.println("Debe ingresar un numero de maximo 4 cifras positivas");
        }  
    } 
}