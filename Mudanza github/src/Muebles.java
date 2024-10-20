import java.util.Arrays;

public class Muebles {
    //
    String [][] items; // nombre y peso
    private double pesoTotal;

    //


    public Muebles(String[][] items, double pesoTotal) {
        this.items = items;
        this.pesoTotal = pesoTotal;
    }

    public String[][] getItems() {
        return items;
    }

    public void setItems(String[][] items) {
        this.items = items;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "items=" + Arrays.toString(items) +
                ", pesoTotal=" + pesoTotal +
                '}';
    }

}
