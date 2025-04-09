public class Paciente {
    private String nombre;
    private int edad;
    private String numeroExpediente;

    public Paciente() {
    }

    public Paciente(String nombre, int edad, String numeroExpediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroExpediente = numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String mostrarInformacion() {
        return "Paciente: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nExpediente: " + getNumeroExpediente();
    }
}
