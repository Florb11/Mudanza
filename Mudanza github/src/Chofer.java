import javax.swing.*;

public class Chofer extends Usuarios{
    // Atributos
    private boolean licenciaConducir;
    private Muebles muebles;

    //


    public Chofer(boolean licenciaConducir, Muebles muebles) {
        super("flor", "123");
        this.licenciaConducir = licenciaConducir;
        this.muebles = muebles;
    }

    public boolean isLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(boolean licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public Muebles getMuebles() {
        return muebles;
    }

    public void setMuebles(Muebles muebles) {
        this.muebles = muebles;
    }

    @Override
    public boolean loguear() {
        boolean logueado = super.loguear(); // preguntar si esta bien hacer algo asi
        if(logueado){
            String[] opciones = {
                    "Cargar camion","Verificar carga","Salir"
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

                        Camion camion1 = new Camion(100,this); // dudas sobre si esta bien crear los objetos aca o como podria hacer
                        //Muebles muebles = new Muebles(10);
                        cargarCamion(camion1);

                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Verificar carga");
                        mostrarItems(this.muebles);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Salir");
                        break;
                }
            } while (opcion!=2);


        }
        return logueado;
    }
    public boolean cargarCamion (Camion camion){
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
    public void mostrarItems(Muebles muebles){
        String mostrarItems = "Lista de Muebles:\n";
        for (int i = 0; i < muebles.getItems().length; i++) {
            mostrarItems =  mostrarItems + "Mueble: " + muebles.getItems()[i][0] +
                    " Peso: " + muebles.getItems()[i][1] + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrarItems);

    }




}
