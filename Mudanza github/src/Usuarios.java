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

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }

    //

    public boolean loguear(){
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
                    if(this.nombreUsuario.equalsIgnoreCase("no asignado")) {
                        this.nombreUsuario = validarNombreUsuario("Ingrese su nombre de usuario");
                        this.contrasenia = validarNumeros("Ingrese su contraseña");
                    }else{
                        JOptionPane.showMessageDialog(null,"Ya esta registrado, puede ingresar");
                    }
                    break;
                case 1:
                    if(!this.nombreUsuario.equalsIgnoreCase("no asignado") ) {
                        int intentosloguear = 0;
                        while (intentosloguear < 3) {
                            String usuarioPlataforma = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
                            String contraseniaPlataforma = JOptionPane.showInputDialog("Ingrese su contraseña");
                            if (this.nombreUsuario.equals(usuarioPlataforma) && this.contrasenia.equals(contraseniaPlataforma)) {
                                JOptionPane.showMessageDialog(null, "todo correcto");
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos intente de nuevo");
                                intentosloguear++;
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Primero cree un cuenta");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo...");
                    break;

            }
        }while (opcion != 2) ;
        return false;
    }

    public String validarNombreUsuario(String mensaje){
        boolean flag;
        String validar;

        do{
            flag=true;
            validar=JOptionPane.showInputDialog(mensaje);
            while(validar.isEmpty()){
                validar=JOptionPane.showInputDialog("Error"+mensaje);
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
    public String validarNumeros(String mensaje) {
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
            }else{
                JOptionPane.showMessageDialog(null,"Todo correcto");
            }


        } while (!flag);
        return valida;

    }




}
