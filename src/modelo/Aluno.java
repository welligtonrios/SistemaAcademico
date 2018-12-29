package modelo;


import java.util.ArrayList;

import java.util.List;

import herdar.Pessoa; 

public class Aluno extends Pessoa {
	
	private String matricula;
	private Situacao situacao;
	private Curso curso;
	
///
	
	private List<Disciplina> listDisciplina = new ArrayList<Disciplina>();

//// metodos especiais 
	
	
public Aluno() {
	
}
	
	
public Aluno (Curso curso) {
	this.curso = curso;
}


public Aluno(String nome, String cpf,String endereco, String email,String telefone, String matricula) {
	super(nome, cpf, telefone,endereco,email);
	this.matricula = matricula;
	//this.curso = curso;
	
}


public Aluno(String nome, String cpf,String endereco, String email,String telefone, Curso curso) {
	super(nome, cpf, telefone,endereco,email);
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
	 
	  if(listDisciplina.size() >= 6) {
		  
		  System.out.println("Numero de disciplina maximo");
		  
	  }else{
		  
		  listDisciplina.add(discipplina);
	  
	  }
	  
	  
}
	
	
	
	
public void mostraDisciplina() {

	for (Disciplina disciplina : listDisciplina) {
		System.out.println(disciplina);
	}
	 
}

public void mostraAluno() {
	
	System.out.println("nome: " + getNome());
	System.out.println("cpf: " + getCpf());
	System.out.println("matricula: " + this.matricula);
	System.out.println("telefone: " + getTelefone());
	System.out.println("Email: " + getEmail());
	System.out.println("Curso: "+ getCurso());
	System.out.println("Disciplinas: " + getDisciplina());
	
}



@Override
public String toString(){
	return "Aluno:  " + getNome()   + " matricula: " + matricula ;
}
	
	
	
	
	
	
	
	
}

	
	

	
	
	
	