import java.util.Arrays;

public class Camion {
    private double capacidad;
    private Chofer chofer;


    public Camion(double capacidad, Chofer chofer) {
        this.capacidad = capacidad;
        this.chofer = chofer;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacidad=" + capacidad +
                ", chofer=" + chofer +
                '}';
    }
}
