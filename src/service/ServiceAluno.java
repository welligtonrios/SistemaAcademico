package service;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Curso;

public class ServiceAluno {
	
	
	ArrayList<Aluno> listAluno = new ArrayList<Aluno>();

	public ArrayList<Aluno> getListAluno() {
		return listAluno;
	}
	
	
	//CRUD 
	
	//colocar um Aluno 
	
	public void addAluno(String nome, long cpf, long matricula, String endereco, String email, long telefone, boolean situacao,
			Curso curso) {
		//obj para receber meu ano;
		Aluno c = new Aluno(nome,cpf,matricula,endereco,email,telefone,situacao,curso);
		
									listAluno.add(c);
	}

	 //pesquisar o Aluno pela matricula
	
	public Aluno buscarAluno(long matricula) {
		
		for (Aluno aluno : listAluno) {
			if (aluno.getMatricula()== matricula ) {
				return aluno;
			}
		}
		
		System.out.println("aluno nao encontrado");
		return null;
		
	}


	
	// remover o Aluno 
	
	public void removeAluno(long matricula) {
		//buscar o aluno para removelo   
	listAluno.remove(buscarAluno(matricula));	
		
	}
	
	
	
	
	
	
	
	
	
	

}
