import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios1= new Usuarios("pepe","234");
        Cliente cliente1 = new Cliente("Flor","flor");
        Muebles muebles1 = new Muebles(4);
        Chofer chofer1 = new Chofer(true,muebles1);
        String capacidad[][] = new String[2][2];
        Camion camion1 = new Camion(1000,chofer1);




        //chofer1.loguear();
        //chofer1.loguear();
        cliente1.loguear();





    }
}