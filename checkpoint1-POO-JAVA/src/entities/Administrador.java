package entities;

import org.w3c.dom.ls.LSOutput;

public class Administrador {
    //declaração de atributos

    public boolean statusUsuario;

    // Constructor padrão

    public Administrador() {
    }



    // Constructor com sobrecarga

    public Administrador( boolean statusUsuario) {


        this.statusUsuario = statusUsuario;

    }

    // Métodos Getters and Setters

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    //Métodos costumizados

    @Override
    public String toString() {
        return "status Usuario= " + statusUsuario  ;
    }
}
