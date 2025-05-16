public class Ambulancia extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String nombre, Operador operador) {
        super(nombre);
        this.gps = new SistemaGPS();  //Crea objeto GPS
        this.sirena = new Sirena();   //Crea objeto sirena
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
