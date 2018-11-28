package modelo;


import java.util.ArrayList;
import java.util.List;

import herdar.Pessoa; 

public class Aluno extends Pessoa {
	
	private String matricula;
	private Situacao situacao;
	private Curso curso;
	
///
	
	private List<Disciplina> listDisciplina = new ArrayList<Disciplina>(6);

//// metodos especiais 
	



public Aluno(String nome, String cpf, String endereco, String email, String telefone, String matricula,
		 Curso curso) {
	super(nome, cpf, endereco, email, telefone);
	this.matricula = matricula;
	this.curso = curso;
	
}



public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public Situacao isSituacao() {
	return situacao;
}

public void setSituacao(Situacao situacao) {
	this.situacao = situacao;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}

public List<Disciplina> getDisciplina() {
	return listDisciplina;
}

public void setDisciplina(List<Disciplina> disciplina) {
	this.listDisciplina = disciplina;
	

}

////metodos publicos


public void addDisciplinaAluno(Disciplina discipplina) {
	
	  listDisciplina.add(discipplina);
	
	
}
	
	
	
	
public void mostraDisciplina() {

	for (Disciplina disciplina : listDisciplina) {
		System.out.println(disciplina);
	}
	 
}



@Override
public String toString() {
	return "Aluno matricula: " + matricula + "\n" + curso + "\n:" + listDisciplina.toString();
}
	
	
	
	
	
	
	
	
}

	
	

	
	
	
	