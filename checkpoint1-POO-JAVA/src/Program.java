import entities.Administrador;
import entities.Professor;
import entities.Aluno;
import entities.Turma;
import entities.Disciplina;

public class Program {
   public static void main(String[] args){
       System.out.println("Instância do primeiro Professor");
       Aluno a1 = new Aluno( "Lopes","Manoel",true,"000000");

       System.out.println(a1);

       //

       System.out.println("Instância do primeiro Aluno");
       Professor p1 = new Professor("Lopes", true, "Manoel","Matemática","00001");

//       p1.nota(7.0);
       p1.calcularMedia(7.0 + 7.0 + 8.0 + 9.0 + 7.0);

       System.out.println(p1);

       //

       System.out.println("Instância de primeira Turma");
       Professor t1 = new Turma;
       System.out.println(t1);



       //
       System.out.println("Instância de primeira disciplina");
       Professor d1 = new Disciplina();
       System.out.println(d1);


   }
}
