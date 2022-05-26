package entities;

import org.w3c.dom.ls.LSOutput;

public class Administrador {
    //declaração de atributos

    public String nomeProfessor;
    public String nomeAluno;
    public boolean statusUsuario;

    // Constructor padrão

    public Administrador() {
    }



    // Constructor com sobrecarga

    public Administrador(String nomeProfessor, String nomeAluno, boolean statusUsuario) {
        this.nomeProfessor = nomeProfessor;
        this.nomeAluno = nomeAluno;
        this.statusUsuario = statusUsuario;

    }


    // Métodos Getters and Setters
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;

    }


    //Métodos costumizados


    @Override
    public String toString() {
        return "Administrador {" +
                "nome Professor= " + nomeProfessor + '\'' +
                ", nome Aluno= " + nomeAluno + '\'' +
                ", status Usuario= " + statusUsuario  ;
    }
}
