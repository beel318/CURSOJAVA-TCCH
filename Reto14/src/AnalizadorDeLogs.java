import java.io.*;
import java.nio.file.*;
import java.text.DecimalFormat;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        Path rutaLogs = Paths.get("errores.log");
        Path rutaRegistroFallos = Paths.get("registro_fallos.txt");

        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLogs)) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }

                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Mostrar resumen en consola
            System.out.println("Resumen del análisis de logs:");
            System.out.println("Líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores (ERROR): " + totalErrores);
            System.out.println("Cantidad de advertencias (WARNING): " + totalWarnings);

            double porcentaje = ((double)(totalErrores + totalWarnings) / totalLineas) * 100;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Porcentaje de líneas con error/advertencia: " + df.format(porcentaje) + "%");

        } catch (IOException e) {
            System.out.println("Error al analizar el archivo: " + e.getMessage());

            try {
                Files.writeString(rutaRegistroFallos,
                        "Error al procesar el archivo: " + e.getMessage() + System.lineSeparator(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Detalles del error registrados en: registro_fallos.txt");
            } catch (IOException ex) {
                System.out.println("No se pudo escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
