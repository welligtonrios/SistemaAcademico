package modelo;

import java.util.ArrayList;

import herdar.Pessoa;


public class Professor extends Pessoa {
	
	private Categoria categoria;
	
	
	//Arraylist para disciplina do professor
	
	
	private ArrayList<Disciplina> disciplinaProf = new ArrayList<Disciplina>();
	
	
//////metodos especiais 
	


	public Professor(String nome, String cpf, String endereco, String email, String telefone) {
	super(nome,cpf,endereco,email, telefone);
	
}
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setDisciplinaProf(ArrayList<Disciplina> disciplinaProf) {
		this.disciplinaProf = disciplinaProf;
	}
	public ArrayList<Disciplina> getDisciplinaProf() {
		return disciplinaProf;
	}


	
	
	/////// metodos publicos
	
	public void disciplinasProff(Disciplina disciplina) {
	disciplinaProf.add(disciplina);
	}


	@Override
	public String toString() {
		return  getNome() ;
	}
	


}
