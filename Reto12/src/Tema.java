
public class Tema implements Comparable<Tema>{
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Implementación orden alfabético por título
    @Override
    public int compareTo(Tema o) {
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public String toString() {
        return titulo + '\'' +
                "Prioridad= " + prioridad;
    }
}
