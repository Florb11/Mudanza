import java.util.Arrays;

public class Muebles {
    //
    private String items[][];
    private String[] nombresMuebles; //nombres
    private String[] pesoItems;

    //


    public Muebles(int cantidadMuebles) {
        this.nombresMuebles = new String[cantidadMuebles];
        this.pesoItems = new String[cantidadMuebles];
        this.items = new String[cantidadMuebles][2]; // dos columnas porque 1 nombres y otra peso
         // Dudas con esto porque no sabia de que manera iniciar el constructor y lo busque
    }


    public String[][] getItems() {
        return items;
    }

    public void setItems(String[][] items) {
        this.items = items;
    }

    public String[] getNombresMuebles() {
        return nombresMuebles;
    }

    public void setNombresMuebles(String[] nombresMuebles) {
        this.nombresMuebles = nombresMuebles;
    }

    public String[] getPesoItems() {
        return pesoItems;
    }

    public void setPesoItems(String[] pesoItems) {
        this.pesoItems = pesoItems;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "items=" + Arrays.toString(items) +
                ", nombresMuebles=" + Arrays.toString(nombresMuebles) +
                ", pesoItems=" + Arrays.toString(pesoItems) +
                '}';
    }
}
