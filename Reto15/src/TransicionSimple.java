public class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("La historia continúa por el camino del bosque.");
        } else {
            System.out.println("Te aventuras en la cueva misteriosa.");
        }
    }
}

