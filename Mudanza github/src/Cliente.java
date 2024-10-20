import javax.swing.*;
import java.time.LocalDate;

public class Cliente extends Usuarios{
    //atri
    private String direccionOrigen;
    private String direccionDestino;
    private boolean mudanza;
    private LocalDate fechaMudanza;

    //con


    public Cliente(String nombreUsuario, String contrasenia, String direccionOrigen, String direccionDestino, boolean mudanza, LocalDate fechaMudanza) {
        super(nombreUsuario, contrasenia);
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.mudanza = mudanza;
        this.fechaMudanza = fechaMudanza;
    }

    public Cliente(String nombreUsuario, String contrasenia) {
        super(nombreUsuario, contrasenia);
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public boolean isMudanza() {
        return mudanza;
    }

    public void setMudanza(boolean mudanza) {
        this.mudanza = mudanza;
    }

    public LocalDate getFechaMudanza() {
        return fechaMudanza;
    }

    public void setFechaMudanza(LocalDate fechaMudanza) {
        this.fechaMudanza = fechaMudanza;
    }


    //
    public void agendarMudanza(){

    }
}
