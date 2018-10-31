package menu;

import java.security.GeneralSecurityException;

import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Pessoa;
import modelo.Professor;
import service.ServiceCurso;
import service.ServiceDisciplina;

public class teste {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		Disciplina chamada = new Disciplina();
		Curso curso = new Curso();
		
		
		
		professor.setNome("Emanuel");
		
		
		curso.setNome("Sistemas");
		curso.setCodigo("11254");
		
		
		
		 b.setNome("jose");	
		 b.setCpf("55555555555555");
		 b.setMatricula("22222222222");
		
		
	 a.setNome("welligton");	
	 a.setCpf("06107138331");
	 a.setMatricula("13115875");
	 
	 chamada.addAluno("welligton", "13115875");
	  
	 
	 
	  
	}

}
