/*
202030799 Manuel Rojas
Dise�ar un algoritmo que imprima con un cartel �Correcto� seg�n el siguiente caso: si el n�mero
N es m�ltiplo de 5 y se encuentra entre los 25 primeros n�meros. N debe ser obtenido
aleatoriamente entre n�meros del 1 al 1000. Primero debe mostrar N.
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        int aleatorio, multiplo5;
        aleatorio = (int) Math.floor(Math.random()*(1000-1+1)+1);
        multiplo5 = aleatorio%5;
        if ((multiplo5 == 0) && (multiplo5 <= 25)){
            System.out.println("Correcto");
        }
    }
}