import java.util.Objects;

public class Factura {
    String folio;
    String cliente;
    double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "folio='" + folio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", total= $" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return Objects.equals(folio, factura.folio);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(folio);
    }
}
