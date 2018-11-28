package menu;


import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Professor;

public class teste {

	public static void main(String[] args) {
		
		
		//disciplinas
		
	 Professor p = new Professor("Fred", "8888888888", "Bela vista", "Alberto@gmail.com", "8899-8899");
	 
	 Disciplina disciplina = new Disciplina("POO",14785,p,10);
	 Disciplina disciplina1 = new Disciplina("SO",14786,p,205);
	 
	//disciplinas professor 
     p.disciplinasProff(disciplina);
     p.disciplinasProff(disciplina1);
	 Curso curso = new Curso("computaçao",p);
	 //grade do curso 
	 curso.grade(disciplina);
	 curso.grade(disciplina1);
	 
	
	 

	 /////// 
	 Professor p1 = new Professor("Tiago", "8888888888", "Bela vista", "Tiago@gmail.com", "8899-8899");
	 
	 Disciplina disciplina2 = new Disciplina("Mat Discreta",14787,p1,13);
	 Disciplina disciplina3 = new Disciplina("ETD",14788,p1,15);
	 
	//disciplinas professor 
     p1.disciplinasProff(disciplina2);
     p1.disciplinasProff(disciplina3);
	 Curso curso1 = new Curso("Sistemas", p1);
	//grade do curso 
	 curso1.grade(disciplina);
	 curso1.grade(disciplina1);
	
	 
	 ///////
	 Professor p2 = new Professor("Diego", "8888888888", "Bela vista", "Diego@gmail.com", "8899-8899");
	 
	 Disciplina disciplina4 = new Disciplina("FMD",14789,p2,34);
	 Disciplina disciplina5 = new Disciplina("Segurança de informação",14790,p2,217);
	 Disciplina disciplina6 = new Disciplina("Redes 1",14791,p2,115);
	 
	//disciplinas professor 
     p2.disciplinasProff(disciplina4);
     p2.disciplinasProff(disciplina5);
     p2.disciplinasProff(disciplina6);
	 Curso curso2 = new Curso("Ciencência da Computaçao", p2);
	//grade do curso
	 curso2.grade(disciplina);
	 curso2.grade(disciplina5);
	 curso2.grade(disciplina6);
	 curso2.grade(disciplina4);


	 Aluno a = new Aluno(" Welligton", "cpf", "endereco", "email", "telefone"," matricula",curso);
	 a.addDisciplinaAluno(disciplina1);
	 a.addDisciplinaAluno(disciplina);
	 
	 Aluno a1 = new Aluno(" Jose", "cpf", "endereco", "email", "telefone"," matricula",curso2);
	 a1.addDisciplinaAluno(disciplina5);
	 a1.addDisciplinaAluno(disciplina4);
	 a1.addDisciplinaAluno(disciplina);
	 
	 Aluno a2 = new Aluno(" Maria", "cpf", "endereco", "email", "telefone"," matricula",curso1);
	 a2.addDisciplinaAluno(disciplina6);
	 a2.addDisciplinaAluno(disciplina3);
	 a2.addDisciplinaAluno(disciplina);
	 
	 Aluno a3 = new Aluno(" Tiago", "cpf", "endereco", "email", "telefone"," matricula",curso);
	 a3.addDisciplinaAluno(disciplina6);
	 a3.addDisciplinaAluno(disciplina5);
	 a3.addDisciplinaAluno(disciplina);
	 a3.addDisciplinaAluno(disciplina4);
	 a3.addDisciplinaAluno(disciplina2);
	
	 //chamada da disciplinas 
	 
	 disciplina.chamada(a);
	 disciplina.chamada(a1);
	 disciplina.chamada(a2);
	 disciplina.chamada(a3);
	 ////
	 disciplina1.chamada(a);
	 ////
	 disciplina2.chamada(a3);
	 ///
	 disciplina3.chamada(a2);
	 //
	 disciplina4.chamada(a1);
	 //
	 disciplina5.chamada(a1);
	 disciplina5.chamada(a3);
	 //
	 disciplina6.chamada(a2);
	 //
	 

	 System.out.println(a1);
	 
	 
	 
	 
	}

}
