package entities;

public class Professor extends Administrador {
    //declaração de atributos

    public  String nomeProfessor;
    private  String formacaoAcademica;
    private  String matriculaProfessor;

    private  double nota;

    // Constructor padrão
    public Professor() {
    }

    // Constructor com sobrecarga

    public Professor(String nomeProfessor, boolean statusUsuario,  String formacaoAcademica, String matriculaProfessor) {
        super(statusUsuario);
        this.nomeProfessor = nomeProfessor;
        this.formacaoAcademica = formacaoAcademica;
        this.matriculaProfessor = matriculaProfessor;
        this.nota = 0.0;
    }




    // Métodos Getters and Setters
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

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

    public void calcularMedia (double valor){
        this.nota = nota + (valor / 4);
        if(nota >= 6.0){
            System.out.println("Aluno Aprovado: " + this.nota);
        }else {
            System.out.println("Aluno Reprado: " + this.nota);

        }
    }


    @Override
    public String toString() {
        return "Professor: {" +
                "Nome do professor: '" + nomeProfessor + '\'' +
                ", Formacao academica: '" + formacaoAcademica + '\'' +
                ", Matricula do professor: '" + matriculaProfessor + '\'' +
                ", Nota=" + nota +
                ", Status do usuario: " + statusUsuario +
                '}';
    }
}

