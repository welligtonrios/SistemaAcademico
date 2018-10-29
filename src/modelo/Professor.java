package modelo;

import java.util.ArrayList;

import herdar.Pessoa;

public class Professor extends Pessoa {
	
	private Categoria categoria;
	
	
	//Arraylist para disciplina do professor
	
	private ArrayList<Disciplina> disciplinaProf = new ArrayList<Disciplina>();
	
	public ArrayList<Disciplina> getDisciplinaProf() {
		return disciplinaProf;
	}



	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	
	
	
	

}
