package service;

import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Curso;

public class ServiceAluno {
	
	List<Aluno> listAlunos = new ArrayList<>();
	
	
	//crud 
	
	public void addaluno(String nome, String cpf,String endereco, String email, String telefone , String matricula){
		Aluno a = new Aluno(nome,cpf,endereco,email,telefone,matricula);
		listAlunos.add(a);
	}
	public void addAluno(Aluno a) {
		listAlunos.add(a);
	}
	
	
	public Aluno buscarAluno(String matricula) {
		
		for (Aluno aluno : listAlunos) {
			if (aluno.getMatricula().equals(matricula)) {
					return aluno;
			}
		}
		System.out.println("Aluno nao encontrado");
		
		return null;
	}
	
	
	

}
