/*
202030799 Manuel Rojas
Dise�ar un algoritmo que genere un n�mero aleatorio del 10 al 50, 
lo muestre y luego calcule y muestre el mismo n�mero disminuido en un 15%.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        int aleatorio = 0;
        aleatorio = (int) Math.floor(Math.random()*(50-10+1)+10);
        System.out.println("El numero generado es: " + aleatorio);
        double disminuido = (0.15*aleatorio) + aleatorio;
        System.out.println("El numero aleatorio disminuido en un 15% es: " + disminuido);
    } 
}