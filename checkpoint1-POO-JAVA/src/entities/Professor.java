package entities;

public class Professor extends Administrador {
    //declaração de atributos

    private  String formacaoAcademica;
    private  String matriculaProfessor;

    // Constructor padrão
    public Professor() {
    }

    // Constructor com sobrecarga
    public Professor(String formacaoAcademica, String matriculaProfessor) {
        this.formacaoAcademica = formacaoAcademica;
        this.matriculaProfessor = matriculaProfessor;
    }

    public Professor(String nomeProfessor, String nomeAluno, boolean statusUsuario, String formacaoAcademica, String matriculaProfessor) {
        super(nomeProfessor, nomeAluno, statusUsuario);
        this.formacaoAcademica = formacaoAcademica;
        this.matriculaProfessor = matriculaProfessor;
    }




    // Métodos Getters and Setters


    //Métodos costumizados
}
