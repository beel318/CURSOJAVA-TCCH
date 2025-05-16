
public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A1234567");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("RESERVA REALIZADA CON ÉXITO.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        System.out.println(vuelo1.obtenerItinerario());

        System.out.println("CANCELANDO RESERVA...\n");
        vuelo1.cancelarReserva();

        System.out.println(vuelo1.obtenerItinerario());

        // Reservar usando nombre y pasaporte
        vuelo1.reservarAsiento("Mario Gonzalez", "M9876543");

        System.out.println(vuelo1.obtenerItinerario());
    }
}