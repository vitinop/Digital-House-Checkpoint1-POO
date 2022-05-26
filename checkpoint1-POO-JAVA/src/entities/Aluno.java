package entities;

public class Aluno extends Administrador {
    //declaração de atributos

    public String matriculaAluno;

    // Constructor padrão
    public Aluno() {
    }

    // Constructor com sobrecarga
    public Aluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public Aluno(String nomeProfessor, String nomeAluno, boolean statusUsuario, String matriculaAluno) {
        super(nomeProfessor, nomeAluno, statusUsuario);
        this.matriculaAluno = matriculaAluno;
    }




    // Métodos Getters and Setters

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }


    //Métodos costumizados


    @Override
    public String toString() {
        return super.toString() +  ", Aluno " +
                "matricula Aluno=  " + matriculaAluno + '\'';
    }
}
