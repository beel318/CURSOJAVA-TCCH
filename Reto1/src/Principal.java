import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Crear objeto Scanner

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();  // Lee una línea completa

        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();  // Lee un número entero
        sc.nextLine(); //leer el salto de linea

        System.out.print("Escribe tu numero de expediente: ");
        String expediente = sc.nextLine();  // Lee una línea completa

        sc.close();  // Cerrar el Scanner

        Paciente p1 = new Paciente();
        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setNumeroExpediente(expediente);

        System.out.println("-------");
        System.out.println(p1.mostrarInformacion());
    }
}
