package modelo;

import java.util.ArrayList;

public class Professor {
	
	private String nome; 
	private long  cpf;
	private String email;
	private long telefone;
	private String endereco;
	private String categoria;
	
	//Arraylist para disciplina do professor
	
	private ArrayList<Disciplina> disciplinaProf = new ArrayList<Disciplina>();
	
	public ArrayList<Disciplina> getDisciplinaProf() {
		return disciplinaProf;
	}

	
	//construtores 
	
	
	public Professor() {
		
	}


	public Professor(String nome, long cpf, String email, long telefone, String endereco, String categoria,
			String disciplinas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.categoria = categoria;
	}

	// getters e setters 
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	
	public void mostraProfessor() {
		
		System.out.println("nome : " + this.nome);
		System.out.println("cpf : " + this.cpf);
		System.out.println("Endereco : " + this.endereco);
		System.out.println("Email : " + this.email);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Disciplinas: \n");
		
		
		
		
	}


	
	
	
	

}
