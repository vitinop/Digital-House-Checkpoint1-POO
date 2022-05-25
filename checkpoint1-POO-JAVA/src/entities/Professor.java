package entities;

public class Professor extends Usuario {
    private String formacaoAcademica;

    public Professor(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public Professor(int idUsuario, String nomeUsuario, String cpf, String email, String formacaoAcademica) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.formacaoAcademica = formacaoAcademica;
    }
}

//Metodos costumizados

