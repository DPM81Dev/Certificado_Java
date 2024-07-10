public class Ejercicio_017 {

    public static void main(String[] args) {
        int altura = 6; // Altura de la pirámide

        for (int i = 1; i <= altura; i++) {
            // Imprime espacios en blanco antes del primer asterisco
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // Imprime el primer asterisco
            System.out.print("*");

            // Imprime espacios en blanco dentro de la pirámide
            for (int k = 1; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }

            // Imprime el último asterisco (borde derecho)
            if (i > 1) {
                System.out.print("*");
            }

            System.out.println(); // Cambia de línea para la siguiente fila
        }
    }
}
