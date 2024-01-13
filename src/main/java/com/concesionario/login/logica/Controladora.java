package com.concesionario.login.logica;

import com.concesionario.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis;

    public Controladora() {
        
        controlPersis = new ControladoraPersistencia();
    }
    

    public String ValidarUsuario(String usuario, String contrasenia) {

        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();

        for (Usuario usu : listaUsuarios) {

            if (usu.getNombreUsurio().equals(usuario)) {

                if (usu.getContrasenia().equals(contrasenia)) {
                    mensaje = "Usuario y contraseña correctos";
                   return mensaje;
                } else {
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }

            } else {
                mensaje = "Usuario no encontrado";
                //return mensaje;
            }

        }
        return mensaje;

    }

}
