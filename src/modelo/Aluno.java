package modelo;

import java.util.ArrayList; 

public class Aluno extends Pessoa {
	
    //
	private String matricula;
	private boolean situacao;
	private Curso curso;
	
	///
	
	
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

	////
public Aluno(){
	
	
}

public Aluno(String nome, String cpf, String matricula, String endereco, String email, String telefone, boolean situacao, Curso curso) {
	super(nome,cpf,endereco,email,telefone);
	this.matricula = matricula;
	this.situacao = situacao;
	this.curso = curso;
}

///////

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public boolean isSituacao() {
	return situacao;
}

public void setSituacao(boolean situacao) {
	this.situacao = situacao;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}

public ArrayList<Disciplina> getDisciplina() {
	return disciplina;
}

public void setDisciplina(ArrayList<Disciplina> disciplina) {
	this.disciplina = disciplina;
}






/////////////////


@Override
public String toString() {
	return "Aluno [matricula=" + matricula + ", situacao=" + situacao + ", curso=" + curso + ", disciplina="
			+ disciplina + "]";
}


////sistuçao


public Boolean  situacao(Aluno objAluno) {
	if(objAluno.getMatricula().equals(matricula) ) {
		System.out.println("O aluno esta matriculado");
		return true;
	}else {
		System.out.println("aluno nao esta matriculado, faça sua matricula");
		return false;
	}
}


public void mostraAluno() {
	
	System.out.println("nome : "+ getNome());
	System.out.println("Curso " + getCurso());
	System.out.println("disciplinas ");
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	

	
	
	
	
	


	
	
	
	
	
}