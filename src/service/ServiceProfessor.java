package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Professor;


public class ServiceProfessor {
	
	
	List<Professor> listprofessores = new ArrayList<>();
	
	
	
public void addProfessor(String nome, String cpf, String endereco, String email, String telefone) {
	Professor p = new Professor(nome,cpf,endereco,email,telefone);
	listprofessores.add(p);
}
	
	
public Professor buscarProfessor(String nome){
	
	for (Professor professor : listprofessores) {
		if (professor.getNome().equals(nome)) {
			return professor;
		}
	}
	System.out.println("Professor não encontrado :(...");
	return null;
}








}
