package entities;

public class Aluno extends Usuario {
    private String matriculaAluno;
    private int anoLetivo;

    private boolean situacaoMatricula;

    public Aluno(boolean situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(int idUsuario, String nomeUsuario, String cpf, String email, boolean situacaoMatricula) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(String matriculaAluno, int anoLetivo) {
        this.matriculaAluno = matriculaAluno;
        this.anoLetivo = anoLetivo;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public boolean isSituacaoMatricula() {
        return situacaoMatricula;
    }

    public void setSituacaoMatricula(boolean situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(int idUsuario, String nomeUsuario, String cpf, String email, String matriculaAluno, int anoLetivo) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.matriculaAluno = matriculaAluno;
        this.anoLetivo = anoLetivo;
    }

    @Override
    public String toString() {
        return super.toString()+"Aluno{" +
                "matriculaAluno='" + matriculaAluno + '\'' +
                ", anoLetivo=" + anoLetivo +
                ", situacaoMatricula=" + situacaoMatricula +
                '}';
    }
}
