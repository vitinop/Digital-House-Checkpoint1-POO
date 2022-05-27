package entities;

public class Aluno extends Administrador {
    //declaração de atributos

    public String matriculaAluno;
    public String nomeAluno;

    // Constructor padrão
    public Aluno() {
    }

    // Constructor com sobrecarga
    public Aluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }


    public Aluno(String nomeAluno, boolean statusUsuario, String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
        this.nomeAluno = nomeAluno;
        this.statusUsuario = statusUsuario;
    }




    // Métodos Getters and Setters

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }



    //Métodos costumizados


    @Override
    public String toString() {
        return "Aluno: {" +
                "Matricula do aluno:'" + matriculaAluno + '\'' +
                ", Nome do aluno:'" + nomeAluno + '\'' +
                ", Status do usuario: " + statusUsuario +
                '}';
    }
}
