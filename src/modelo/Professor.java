package modelo;

import java.util.ArrayList;


public class Professor extends Pessoa {
	
	private int categoria;
	
	
	//Arraylist para disciplina do professor
	
	private ArrayList<Disciplina> disciplinaProf = new ArrayList<Disciplina>();
	
	
//////
	
public Professor(){

}


	public Professor(int categoria,String nome, String cpf, String endereco, String email, String telefone) {
	super(nome,cpf,endereco,email, telefone);
	this.categoria = categoria;
}


	

////////
	
	
	
	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void setDisciplinaProf(ArrayList<Disciplina> disciplinaProf) {
		this.disciplinaProf = disciplinaProf;
	}
	public ArrayList<Disciplina> getDisciplinaProf() {
		return disciplinaProf;
	}


	
	
	///////
	
	@Override
	public String toString() {
		return "Professor [categoria=" + categoria + ", disciplinaProf=" + disciplinaProf + "]";
	}
	
	
	

}
