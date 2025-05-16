import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> consumosRegistrados = new HashSet<>();

        try {
            System.out.println("Monitoreo de CPU de servidores");
            System.out.println("Ingresa el consumo de CPU de los servidores (en %). Escribe -1 para terminar.");

            while (true) {
                System.out.print("Ingresar consumo: ");
                String entrada = scanner.nextLine();

                // Termina la entrada con -1
                if (entrada.equals("-1")) {
                    break;
                }

                try {
                    int consumo = Integer.parseInt(entrada);

                    // Validaciones
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("El consumo debe estar entre 0 y 100.");
                        continue;
                    }

                    if (consumosRegistrados.contains(consumo)) {
                        System.out.println("Este valor ya fue registrado.");
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException("¡Alerta! El servidor ha superado el 95% de uso de CPU.");
                    }

                    // Agregar si pasa validaciones
                    consumosRegistrados.add(consumo);
                    System.out.println("Consumo registrado exitosamente: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingresa un número.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("\nResumen de monitoreo:");
            for (int c : consumosRegistrados) {
                System.out.println("Servidor con consumo: " + c + "%");
            }

        } finally {
            scanner.close();
            System.out.println("\n Recursos cerrados correctamente.");
        }
    }
}
