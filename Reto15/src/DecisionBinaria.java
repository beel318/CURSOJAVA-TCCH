import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("A) Seguir el camino iluminado");
        System.out.println("B) Entrar a la cueva oscura");
        String decision = scanner.nextLine().toUpperCase();
        return decision;
    }
}
