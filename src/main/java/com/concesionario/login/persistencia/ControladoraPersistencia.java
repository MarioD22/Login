
package com.concesionario.login.persistencia;

import com.concesionario.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
    return usuJPA.findUsuarioEntities();
    
    }
    
}
