package modelo;

import java.util.ArrayList;

public class Aluno {
	
	private String nome; 
	private long  cpf;
	private long matricula;
	private String endereço;
	private String email;
	private long telefone;
	private boolean situacao;
	private String curso;

	
	//ArrayL para armazenar as disciplinas 
	
	String [] disciplinas = new String[6];
	
	 public String[] getDisciplinas() {
		return disciplinas;
	}


	
	
	//construtores
	
	public Aluno() {
		
	}

	public Aluno(String nome, long cpf, long matricula, String endereço, String email, long telefone, boolean situacao,
			String curso, ArrayList<String> disciplinas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereço = endereço;
		this.email = email;
		this.telefone = telefone;
		this.situacao = situacao;
		this.curso = curso;
	}
	
	
	// getters and setters

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

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public void mostraAluno() {
		
		System.out.println("nome : " + this.nome);
		System.out.println("cpf : " + this.cpf);
		System.out.println("matricula: " + this.matricula);
		System.out.println("Endereço : " + this.endereço);
		System.out.println("Email : " + this.email);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Situação : " + this.situacao);
		System.out.println("curso : " + this.curso);
		
		System.out.println("Disciplinas: \n");
		
		for (String disciplina : disciplinas) {
			System.out.println(disciplina);
			
			
		}
		
		
	}
	

	
	
	
	
	


	
	
	
	
	
}