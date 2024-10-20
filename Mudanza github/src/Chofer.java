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
                    "Cargar camion","Verificar carga","Mover","Salir"
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
                        JOptionPane.showMessageDialog(null, "Cargando camion...");

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
    public boolean cargarCamion (Camion camion, Muebles muebles){
        double totalPeso = 0;
        if(muebles.getNombresMuebles().length > 0) {
            for (int i = 0; i < muebles.getNombresMuebles().length; i++) {
                muebles.getNombresMuebles()[i] = JOptionPane.showInputDialog("Ingrese el nombre del mueble");
                muebles.getPesoItems()[i] = JOptionPane.showInputDialog("Ingrese el peso para el item " + muebles.getNombresMuebles()[i]);
                muebles.getItems()[i][0] = muebles.getNombresMuebles()[i];
                muebles.getItems()[i][1] = muebles.getPesoItems()[i];
                totalPeso = totalPeso + Double.parseDouble(muebles.getPesoItems()[i]);

            }
            JOptionPane.showMessageDialog(null,"La suma total del peso es: "+ totalPeso);
            if(totalPeso < camion.getCapacidad()){
                JOptionPane.showMessageDialog(null,"La carga se puede hacer");
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"contrate un camion mas grande F");
                return false;
            }

        }else{
            JOptionPane.showMessageDialog(null,"No hay items que agregar");
            return false;
        }

    }




}
