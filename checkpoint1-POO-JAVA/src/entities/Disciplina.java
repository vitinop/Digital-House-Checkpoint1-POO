package entities;

public class Disciplina extends Professor{
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

    // Métodos Getters and Setters


    //Métodos costumizados


    @Override
    public String toString() {
        return
                "Nota do aluno:  " + notaAluno +
                ", Nome da disciplina: " + nomeDisciplina + '\'';
    }
}
