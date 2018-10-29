package modelo;

import java.util.ArrayList;

import herdar.Pessoa;

public class Aluno extends Pessoa {
	
	private Situacao situacao;
	
	
	
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

	
	
	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	
	

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	
	

	
	
	
	
	


	
	
	
	
	
}