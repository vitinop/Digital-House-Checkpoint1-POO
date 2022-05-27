package entities;

public class Turma extends Disciplina {
    //declaração de atributos

    public String serieTurma;
    public String anoTurma;

    // Constructor padrão

    // Constructor com sobrecarga
    public Turma(String serieTurma, String anoTurma) {

        this.serieTurma = serieTurma;
        this.anoTurma = anoTurma;
    }


    // Métodos Getters and Setters

    public String getSerieTurma() {
        return serieTurma;
    }

    public void setSerieTurma(String serieTurma) {
        this.serieTurma = serieTurma;
    }

    public String getAnoTurma() {
        return anoTurma;
    }

    public void setAnoTurma(String anoTurma) {
        this.anoTurma = anoTurma;
    }


    //Métodos costumizados


    @Override
    public String toString() {
        return  "Serie da turma: " + serieTurma + '\'' +
                ", Ano da turma: " + anoTurma + '\'';
    }
}
