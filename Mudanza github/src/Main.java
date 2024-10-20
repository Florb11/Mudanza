import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios1= new Usuarios("pepe","234");
        Cliente cliente1 = new Cliente("Flor","fdsf");
        Chofer chofer1 = new Chofer(true);
        String capacidad[][] = new String[2][2];
        Camion camion1 = new Camion(10,chofer1);
        Muebles muebles1 = new Muebles(4);



        //chofer1.loguear();
        chofer1.cargarCamion(camion1,muebles1);





    }
}