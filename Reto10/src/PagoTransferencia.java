public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionExterna;

    public PagoTransferencia(double monto, boolean validacionExterna) {
        super(monto);
        this.validacionExterna = validacionExterna;
    }

    @Override
    public boolean autenticar() {
        if (validacionExterna) {
            System.out.println("Autenticación exitosa.");
            return true;
        } else {
            System.out.println("Fallo de autenticación. Transferencia no válida.");
            return false;
        }
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
}
