import entities.Administrador;
import entities.Professor;
import entities.Aluno;
import entities.Turma;
import entities.Disciplina;

public class Program {
   public static void main(String[] args){
       Aluno a1 = new Aluno( "Lopes","Manoel",true,"000000");

       System.out.println(a1);

       Professor p1 = new Professor("Lopes", true, "Manoel","Matemática","00001");

       p1.nota(7.0);

       System.out.println(p1);


   }
}
