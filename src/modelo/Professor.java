package modelo;

import java.util.ArrayList;

import herdar.Pessoa;


public class Professor extends Pessoa {
	
	private Categoria categoria;
	
	
	//Arraylist para disciplina do professor
	
	
	private ArrayList<Disciplina> disciplinaProf = new ArrayList<Disciplina>();
	
	
//////metodos especiais 
	
   public Professor() {
	   
   }

	public Professor(String nome, String cpf, String endereco, String email, String telefone) {
	super(nome,cpf,endereco,email, telefone);
	//this.categoria = categoria;
	//this.disciplinaProf = ArrayList<Disciplina>;
	
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
		return "Disciplinas: " + disciplinaProf ; 
	}

	
	public void mostraProfessor() {
		
		System.out.println("Nome: " + getNome());
		System.out.println("cpf: " + getCpf());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("telefone: " + getTelefone());
		System.out.println("Email: " + getEmail());
		System.out.println("Telefone: " + getTelefone());
		//System.out.println("Categoria: " + this.categoria);
		
		
		
		
		
		
		
	}
	
	
	


}
