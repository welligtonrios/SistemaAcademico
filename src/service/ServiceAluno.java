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
	
	//cadastrar um Aluno 
	
	public void addAluno(String nome, String cpf, long matricula, String endereco, String email, long telefone, boolean situacao,
			Curso curso) {
		
		
		//obj para receber meu aluno;
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		//receber a matricula
		aluno.setMatricula(matricula);
		
	}

	 //pesquisar o Aluno pela matricula
	
	public Aluno buscarAluno(long matricula, String nome ) {
		
		for (Aluno aluno : listAluno) {
			if (aluno.getMatricula()== matricula ) {
				return aluno;
			} else {
				for ( Aluno aluno1 : listAluno) {
					if (aluno1.getNome().equals(nome)) {
						
					}
				}
			}
		}
		
		System.out.println("aluno nao encontrado");
		return null;
		
	}


	
	// Exclusão do Aluno 
	
	public void removeAluno(long matricula) {
		//buscar o aluno para removelo   
	listAluno.remove(buscarAluno(matricula, null));	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
