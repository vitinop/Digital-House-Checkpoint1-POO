package entities;

public class Disciplina extends Administrador{
    //declaração de atributos

    public double notaAluno;
    public String nomeDisciplina;

    // Constructor padrão
    public Disciplina() {
    }

    // Constructor com sobrecarga


    public Disciplina(double notaAluno, String nomeDisciplina) {
        this.notaAluno = notaAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public Disciplina(String nomeProfessor, String nomeAluno, boolean statusUsuario, double notaAluno, String nomeDisciplina) {
        super(nomeProfessor, nomeAluno, statusUsuario);
        this.notaAluno = notaAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    // Métodos Getters and Setters


    //Métodos costumizados
}
