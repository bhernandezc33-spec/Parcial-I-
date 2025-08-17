import java.util.Scanner;
public class EscaleradeNumeros {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el número de niveles (n >= 1): ");
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("Error: el número debe ser mayor o igual a 1.");
            } else {
                System.out.println("\nEscalera Ascendente:");
                imprimirAscendente(n);

                System.out.println("\nEscalera Descendente:");
                imprimirDescendente(n);
            }

            sc.close();
        }

        // Procedimiento para imprimir escalera ascendente
        public static void imprimirAscendente(int niveles) {
            for (int i = 1; i <= niveles; i++) {
                imprimirLinea(i); // Método sobrecargado que imprime números
            }
        }

        // Procedimiento para imprimir escalera descendente
        public static void imprimirDescendente(int niveles) {
            for (int i = niveles - 1; i >= 1; i--) {
                imprimirLinea(i); // Método sobrecargado que imprime números
            }
        }

        // Método sobrecargado 1: imprime números
        public static void imprimirLinea(int nivel) {
            for (int i = 1; i <= nivel; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Método sobrecargado 2: imprime un símbolo
        public static void imprimirLinea(int nivel, char simbolo) {
            for (int i = 1; i <= nivel; i++) {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }

}
