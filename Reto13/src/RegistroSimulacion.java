import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {
    // Ruta del archivo
    private static final Path RUTA_ARCHIVO = Paths.get("config", "parametros.txt");

    public static void main(String[] args) {
        try {
            guardarParametros();
            if (Files.exists(RUTA_ARCHIVO)) {
                System.out.println("Archivo creado exitosamente: " + RUTA_ARCHIVO);
                leerParametros(); // Leer y mostrar el contenido
            } else {
                System.out.println("Error: El archivo no fue creado.");
            }
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }

    public static void guardarParametros() throws IOException {
        // Crear carpeta si no existe
        if (!Files.exists(RUTA_ARCHIVO.getParent())) {
            Files.createDirectories(RUTA_ARCHIVO.getParent());
        }

        String parametros = """
            Tiempo de ciclo: 55.8 segundos
            Velocidad de línea: 1.2 m/s
            Número de estaciones: 8
            """;

        // Escribir los parámetros en el archivo
        Files.write(RUTA_ARCHIVO, parametros.getBytes());
    }

    public static void leerParametros() throws IOException {
        String contenido = Files.readString(RUTA_ARCHIVO);
        System.out.println("\n Contenido del archivo de configuración:");
        System.out.println(contenido);
    }
}
