import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var saldo = 1000.0;
        int opcion;

        //CONTINUE - Salta a la siguiente iteración cuando es necesario.

        Scanner entrada = new Scanner(System.in);

        do{
                //Menu principal
                System.out.println("\nBienvenido al cajero automático");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");
                opcion = entrada.nextInt();

                //Estructura SWITCH
                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual: $" + saldo);
                        break;
                    case 2:
                        System.out.print("Ingresa el monto a depositar: ");
                        //Entrada de usuario del monto a depositar
                        double deposito = entrada.nextDouble();
                        if (deposito > 0) {
                            //Sumar saldo + deposito
                            saldo += deposito;
                            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                        } else {
                            System.out.println("El monto debe ser mayor a 0.");
                        }
                        break;
                    case 3:
                        System.out.print("Ingresa el monto a retirar: ");
                        //Entrada de usuario del monto a retirar
                        double retiro = entrada.nextDouble();
                        //Verificar fondos
                        if (retiro > saldo) {
                            System.out.println("Fondos insuficientes. Tu saldo es: $" + saldo);
                            continue;
                        } else if (retiro <= 0) {
                            System.out.println("El monto debe ser mayor a 0.");
                            continue;
                        } else {
                            //Restar saldo - retiro
                            saldo -= retiro;
                            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                        }
                        break;
                    case 4:
                        System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta nuevamente.");
                        break;
                }
            } while (opcion != 4);

            entrada.close();
    }
}
