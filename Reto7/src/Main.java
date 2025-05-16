
public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura("FAC001","Andrea Perez",2000.0);
        Factura f2 = new Factura("FAC001","Natali Hernandez",3000.0);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}