package entities;

public class Aluno extends Usuario {
    private String matriculaAluno;
    private int anoLetivo;

    private boolean situacaoMatricula;

    public Aluno(boolean situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(String idUsuario, String nomeUsuario, String cpf, String email, boolean situacaoMatricula) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(String matriculaAluno, int anoLetivo) {
        this.matriculaAluno = matriculaAluno;
        this.anoLetivo = anoLetivo;
    }

    public Aluno(String idUsuario, String nomeUsuario, String cpf, String email, String matriculaAluno, int anoLetivo) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.matriculaAluno = matriculaAluno;
        this.anoLetivo = anoLetivo;
    }

}
