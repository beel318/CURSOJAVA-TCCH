import java.util.*;

public class RegistroMuestras {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden
        List<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Arabidopsis thaliana");
        //Muestras replicadas
        listaMuestras.add("Homo sapiens");
        listaMuestras.add("Mus musculus");

        // Paso 2: HashSet para filtrar especies únicas
        Set<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        Map<String, String> idMuestraInvestigador = new HashMap<>();
        idMuestraInvestigador.put("M-001", "Dra. López");
        idMuestraInvestigador.put("M-002", "Dr. Hernández");
        idMuestraInvestigador.put("M-003", "Lic. García");
        idMuestraInvestigador.put("M-004", "Dra. López");
        idMuestraInvestigador.put("M-005", "Dr. Torres");

        // Paso 4: Mostrar resultados
        System.out.println("Orden de llegada de las muestras:");
        for (String especie : listaMuestras) {
            System.out.println(especie);
        }

        System.out.println();

        System.out.println("Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println(especie);
        }

        System.out.println();

        System.out.println("Relación ID de muestra → Investigador responsable:");
        for (Map.Entry<String, String> entrada : idMuestraInvestigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        System.out.println();

        String idBusqueda = "M-002";
        System.out.println("Búsqueda de investigador por ID de muestra (" + idBusqueda + "):");
        if (idMuestraInvestigador.containsKey(idBusqueda)) {
            System.out.println("Responsable: " + idMuestraInvestigador.get(idBusqueda));
        } else {
            System.out.println("No se encontró información para el ID " + idBusqueda);
        }
    }
}
