public class Ejercicio_016 {

    public static void main(String[] args) {
        int altura = 5; // Altura de la pirámide

        for (int i = 1; i <= altura; i++) {
            // Imprime espacios en blanco antes de los asteriscos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprime los asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Cambia de línea para la siguiente fila
        }
    }
}
