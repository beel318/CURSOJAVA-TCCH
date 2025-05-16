public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        if (saldoDisponible >= monto) {
            System.out.println("Autenticación exitosa.");
            return true;
        } else {
            System.out.println("Fondos insuficientes en la tarjeta.");
            return false;
        }
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}

