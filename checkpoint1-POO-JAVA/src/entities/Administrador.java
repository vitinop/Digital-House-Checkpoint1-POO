package entities;

public class Administrador extends Usuario{
    private String admPassword;

    public Administrador(String admPassword) {
        this.admPassword = admPassword;
    }

    public Administrador(String idUsuario, String nomeUsuario, String cpf,  String email, String admPassword) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.admPassword = admPassword;
    }

    //Metodos costumizados

    public String getAdmPassword() {
        return admPassword;
    }

    private class String {
    }
}


