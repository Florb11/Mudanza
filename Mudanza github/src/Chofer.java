import javax.swing.*;

public class Chofer extends Usuarios{
    // Atributos
    private boolean licenciaConducir;

    //

    public Chofer(boolean licenciaConducir) {
        super("no asignado", "no asignado");
        this.licenciaConducir = licenciaConducir;
    }

    public boolean isLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(boolean licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    @Override
    public boolean loguear() {
        boolean logueado = super.loguear(); // preguntar
        if(logueado){
            String[] opciones = {
                    "Cargar camión","Verificar carga","Mover","Salir"
            };
            int opcion;
            do {
                opcion = JOptionPane.showOptionDialog(null,
                        "Menu chofer",
                        "",
                        0,
                        0,
                        null,
                        opciones,
                        opciones[0]);
                switch (opcion) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Cargar camion");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Verificar carga");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mover");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Salir");
                        break;
                }
            } while (opcion!=3);


        }
        return logueado;
    }
}
