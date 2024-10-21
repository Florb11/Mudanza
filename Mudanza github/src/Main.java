import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Muebles muebles1 = new Muebles(4);
        Chofer chofer1 = new Chofer("flor","flor123",true,muebles1);
        Camion camion1 = new Camion(1000,chofer1);





        String[] menu = {
                "Chofer", "Cliente", "Salir"
        };
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "Menu chofer",
                    "",
                    0,
                    0,
                    null,
                    menu,
                    menu[0]);
            switch (opcion) {
                case 0:
                    cliente1.loguear();
                    break;
                case 1:
                    chofer1.loguear();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo");

                    break;
            }
        } while (opcion!=2);






    }
}