import java.util.Scanner;

/*
202030799 Manuel Rojas
Dise�ar un algoritmo que genere un n�meroaleatorio del 0 al 200, 
lo muestre y luego calcule y muestre el mismo n�mero aumentado en un 30%.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio = (int) Math.floor(Math.random()*(200+1));
        System.out.println("El numero generado es: " + aleatorio);
        double aumentado = (0.3*aleatorio) + aleatorio;
        System.out.println("El numero aleatorio aumentado es un 30% es: " + aumentado);        
    }
}