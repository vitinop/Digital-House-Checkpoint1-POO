import entities.Professor;
import entities.Aluno;
import entities.Turma;
import entities.Disciplina;

public class Program {
   public static void main(String[] args){
       System.out.println("Instância do primeiro Aluno");
       Aluno a1 = new Aluno( "Manoel",true,"000000");
       System.out.println(a1);
       System.out.println("");
       //

       System.out.println("Instância do primeiro Professor");
       Professor p1 = new Professor("Lopes", true, "Matemática","00001");

       //
       Professor p2 = new Professor("Leoncio",true, "Português","00002");


       //
       p1.calcularMedia(7.0 + 7.0 + 8.0 + 9.0);
       System.out.println(p1);
       System.out.println("");
       p2.calcularMedia(8.0 + 6.0 + 5.0 + 9.0);
       System.out.println(p2);


       //

       System.out.println("Instância de primeira Turma");
       Turma t1 = new Turma("8 ano","2016");
       System.out.println(t1);
       System.out.println("");


       //
       System.out.println("Instância de primeira disciplina");
       Disciplina d1 = new Disciplina(7.75,"Matemática");
       System.out.println(d1);
       System.out.println("");
       System.out.println("Instância de segunda disciplina");
       Disciplina d2 = new Disciplina(7.0,"Português");
       System.out.println(d2);



   }
}
