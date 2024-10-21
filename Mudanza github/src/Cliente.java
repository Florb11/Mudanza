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

    @Override
    public boolean loguear() {
        boolean logueado = super.loguear();
        if (logueado) {
            String[] opciones = {
                    "Agendar mudanza", "Ver estado de mudanza", "Salir"
            };
            int opcion;
            do {
                opcion = JOptionPane.showOptionDialog(null,
                        "Menu cliente",
                        "",
                        0,
                        0,
                        null,
                        opciones,
                        opciones[0]);
                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Agendando mudanza...");
                        agendarMudanza();

                        break;
                    case 1:
                        mostrarMudanza();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Salir");
                        break;

                }
            } while (opcion != 2);


        }
        return logueado;
    }

    public boolean agendarMudanza(){
        if(!this.mudanza) {
            this.direccionOrigen = JOptionPane.showInputDialog("Ingrese la direccion de origen");
            this.direccionDestino = JOptionPane.showInputDialog("Ingrese la direccion de Destino");
            String[] fechasDisponibles = {
                    "2024/11/11", "2024/12/12", "2024/10/15", "2024/10/17", "2024/10/19"
            };

            int elegida = JOptionPane.showOptionDialog(null,
                    "Elija una fecha:",
                    "",
                    0,
                    0,
                    null,
                    fechasDisponibles,
                    fechasDisponibles[0]);
            //this.fechaMudanza = LocalDate.parse(fechasDisponibles[elegida]); // esto no me funciona :(

            JOptionPane.showMessageDialog(null, "Direccion de Origen: " + this.direccionOrigen + "\n" + "Direccion de destino: " + this.direccionDestino + "\n" + "En la fecha: " + elegida);
            this.mudanza = true;
        }else{
            JOptionPane.showMessageDialog(null,"Ya tiene una reserva para su mudanza: ");
        }
        return true;



    }
    public void mostrarMudanza(){
        if(!this.mudanza) {
            JOptionPane.showMessageDialog(null,"Primero realiza una reserva");
        }else{
            JOptionPane.showMessageDialog(null, "Direccion de Origen" + this.direccionOrigen + "\n" + "Direccion de destino" + this.direccionDestino + "\n" + "En la fecha: " +this.fechaMudanza);
        }

    }




}
