import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del medicamento: ");
        String medicamento = sc.nextLine();

        System.out.println("Precio unitario: ");
        double precioUnitario = sc.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int piezas = sc.nextInt();

        //formula para precio sin descuento
        double totalSinDescuento = piezas * precioUnitario;

        //Verificar si se aplica el descuento
        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;

        // Calcular total a pagar
        double totalPagar = totalSinDescuento - descuento;

        // Mostrar resultados
        System.out.println("\n--- Resumen de compra ---");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + piezas);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        //Cerrar la clase scanner
        sc.close();
    }
}
