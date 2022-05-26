package entities;

public class Turma extends Administrador{
    //declaração de atributos

    public String serieTurma;
    public String anoTurma;

    // Constructor padrão
    public Turma() {}
    public Turma(String serieTurma, String anoTurma) {
        this.serieTurma = serieTurma;
        this.anoTurma = anoTurma;
    }

    // Constructor com sobrecarga
    public Turma(String nomeProfessor, String nomeAluno, boolean statusUsuario, String serieTurma, String anoTurma) {
        super(nomeProfessor, nomeAluno, statusUsuario);
        this.serieTurma = serieTurma;
        this.anoTurma = anoTurma;
    }



    // Métodos Getters and Setters


    //Métodos costumizados
}
