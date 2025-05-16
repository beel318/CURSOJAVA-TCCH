
public class Principal {
    public static void main(String[] args) {
        Factura facturaConRFC = new Factura(5000.0, "Despacho de abogados", "ABCC010101XYZ");
        Factura facturaSinRFC = new Factura(1000.0, "Reparación de equipo", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}