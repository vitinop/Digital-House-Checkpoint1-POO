package entities;

public class Professor extends Administrador {
    //declaração de atributos

    private  String formacaoAcademica;
    private  String matriculaProfessor;

    private  double nota;

    // Constructor padrão
    public Professor() {
    }

    // Constructor com sobrecarga

    public Professor(String nomeProfessor, boolean statusUsuario, String nomeAluno, String formacaoAcademica, String matriculaProfessor) {
        super(nomeProfessor, nomeAluno, statusUsuario);
        this.formacaoAcademica = formacaoAcademica;
        this.matriculaProfessor = matriculaProfessor;
        this.nota = 0.0;
    }




    // Métodos Getters and Setters

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(String matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota(){
        return nota;
    }

    //Métodos costumizados

    public void nota(double valor) {
        this.nota = this.nota + valor;
        System.out.println("Sua nota agora é: " + this.nota);
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" +
                "formacaoAcademica='" + formacaoAcademica + '\'' +
                ", matriculaProfessor='" + matriculaProfessor + '\'' +
                ", nota=" + nota +
                '}';
    }
}
