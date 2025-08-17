import java.util.Scanner;
public class Temperatura {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] temperaturas = new double[7];
            String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            boolean datosIngresados = false;
            int opcion;

            do {
                System.out.println("\n--- Control de Temperaturas Diarias ---");
                System.out.println("1. Ingresar temperaturas");
                System.out.println("2. Mostrar todas las temperaturas");
                System.out.println("3. Mostrar temperatura máxima");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        for (int i = 0; i < 7; i++) {
                            System.out.print("Ingrese la temperatura máxima del " + dias[i] + ": ");
                            temperaturas[i] = sc.nextDouble();
                        }
                        datosIngresados = true;
                        break;

                    case 2:
                        if (datosIngresados) {
                            mostrarTemperaturas(temperaturas, dias);
                        } else {
                            System.out.println("Debe ingresar las temperaturas primero.");
                        }
                        break;

                    case 3:
                        if (datosIngresados) {
                            int indiceMax = indiceTemperaturaMaxima(temperaturas);
                            mostrarMaxima(temperaturas[indiceMax]);
                            mostrarMaxima(temperaturas[indiceMax], dias[indiceMax]);
                        } else {
                            System.out.println("Debe ingresar las temperaturas primero.");
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } while (opcion != 4);

            sc.close();
        }

        // Procedimiento para mostrar todas las temperaturas
        public static void mostrarTemperaturas(double[] temperaturas, String[] dias) {
            System.out.println("\n--- Temperaturas Registradas ---");
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.println(dias[i] + ": " + temperaturas[i] + "°C");
            }
        }

        // Función para obtener el índice de la temperatura máxima
        public static int indiceTemperaturaMaxima(double[] temperaturas) {
            int indiceMax = 0;
            for (int i = 1; i < temperaturas.length; i++) {
                if (temperaturas[i] > temperaturas[indiceMax]) {
                    indiceMax = i;
                }
            }
            return indiceMax;
        }

        // Método sobrecargado sin nombre del día
        public static void mostrarMaxima(double temperatura) {
            System.out.println("La temperatura máxima registrada es: " + temperatura + "°C");
        }

        // Método sobrecargado con nombre del día
        public static void mostrarMaxima(double temperatura, String dia) {
            System.out.println("La temperatura máxima registrada es: " + temperatura + "°C en " + dia);
        }


}
