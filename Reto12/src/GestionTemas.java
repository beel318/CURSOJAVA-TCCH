import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class GestionTemas {
    public static void main(String[] args) {
        // Lista de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregar temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Mapa con recursos asociados a los temas
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        // Mostrar lista ordenada alfabéticamente
        System.out.println("Temas ordenados alfabéticamente:");
        Collections.sort(temas); // usa compareTo()
        for (Tema t : temas) {
            System.out.println("• " + t + " → " + recursos.get(t.getTitulo()));
        }

        System.out.println();

        // Ordenar por prioridad ascendente
        System.out.println("Temas ordenados por prioridad:");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temas) {
            System.out.println("• " + t + " → " + recursos.get(t.getTitulo()));
        }
    }
}