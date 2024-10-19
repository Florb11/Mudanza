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

    public boolean loguear(String contraseniaPlataforma, String usuarioPlataforma){
        String[] menu = {
                "Crear usuario", "loguear", "Salir"
        };

    }



}