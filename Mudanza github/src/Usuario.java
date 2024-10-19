import javax.swing.*;

public class Usuarios {
    //atri
    private String nombreUsuario;
    private String contrasenia;

    //con


    public Usuarios(String nombreUsuario,  String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    // get y set

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombre(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //

    public void loguear(){
        String[] menu = {
                "Crear usuario", "loguear", "Salir"
        };
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null,
                    "Menu",
                    null,
                    0,
                    0,
                    null,
                    menu,
                    menu[0]);

            switch (opcion) {
                case 0:
                    validarNombreUsuario(this.nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario"));
                    JOptionPane.showMessageDialog(null,"La contraseña debe contener al menos un numero");
                    validarNumeros(this.contrasenia = JOptionPane.showInputDialog("Ingrese su contrasenia"));
                    break;
                case 1:
                    int intentosloguear = 0;
                    while (intentosloguear < 3) {
                        String usuarioPlataforma = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                        String contraseniaPlataforma = JOptionPane.showInputDialog("Ingrese su contraseña");
                        if (this.nombreUsuario.equals(usuarioPlataforma) && this.contrasenia.equals(contraseniaPlataforma)) {
                            JOptionPane.showMessageDialog(null, "todo correcto");
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos intente de nuevo");
                            intentosloguear++;
                        }
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo...");
                    break;

            }
        }while (opcion != 2) ;

    }

    public  String validarNombreUsuario(String mensaje){
        boolean flag;
        String validar;

        do{
            flag=true;
            validar=JOptionPane.showInputDialog(null,mensaje);
            while(validar.isEmpty()){
                validar=JOptionPane.showInputDialog(null,"Error"+mensaje);
            }
            for (int i = 0; i < validar.length(); i++) {
                if(!Character.isAlphabetic(validar.charAt(i))){
                    JOptionPane.showMessageDialog(null,"Ingresa el nombre, sin numeros");
                    flag=false;
                    break;
                }

            }

        }while(!flag);
        return validar;
    }
    public static int validarNumeros(String mensaje) {
        boolean flag;
        String valida;
        do {
            flag = true;
            valida = JOptionPane.showInputDialog(mensaje);
            while(valida.isEmpty()) {
                valida = JOptionPane.showInputDialog("Error " + mensaje);
            }
            boolean contieneNumero = false;
            for (int i = 0; i < valida.length(); i++) {
                if (Character.isDigit(valida.charAt(i))) {
                    contieneNumero = true;
                    break;
                }
            }
            if (!contieneNumero) {
                JOptionPane.showMessageDialog(null, "Debe ingresar al menos un numero.");
                flag = false;
            }


        } while (!flag);
        return Integer.parseInt(valida);

    }



}
