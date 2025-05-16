
public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0, false) // Esta fallará
        };

        for (MetodoPago pago : pagos) {
            Autenticable metodo = (Autenticable) pago;
            if (metodo.autenticar()) {
                pago.procesarPago();
                pago.mostrarResumen();
            }
            System.out.println(); // Separador de cada intento
        }
    }
}
