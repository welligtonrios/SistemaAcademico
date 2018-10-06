package modelo;

import java.util.ArrayList;

public class Aluno {
	
	private String nome; 
	private long  cpf;
	private long matricula;
	private String endereco;
	private String email;
	private long telefone;
	private boolean situacao;
	private Curso curso;
   
	
	
	private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
	
	
	//construtores
	
	public Aluno() {
		
	}

	public Aluno(String nome, long cpf, long matricula, String endereco, String email, long telefone, boolean situacao,
			Curso curso) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.situacao = situacao;
		this.curso = curso;
		
	}
	
	
	// getters and setters

	public ArrayList<Disciplina> getdisciplina(){
		return this.disciplina;
	}
	
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	//metodo que retorna os dados do aluno
	
	public void mostraAluno() {
		
		System.out.println("nome : " + this.nome);
		System.out.println("cpf : " + this.cpf);
		System.out.println("matricula: " + this.matricula);
		System.out.println("Endereco : " + this.endereco);
		System.out.println("Email : " + this.email);
		System.out.println("Telefone : " + this.telefone);
		System.out.println("Situaco : " + this.situacao);
		System.out.println("curso : " + this.curso);
		
   //listar as disciplinas 
		
		
		
	}
	

	
	
	
	
	


	
	
	
	
	
}