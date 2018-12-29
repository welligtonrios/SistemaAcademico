package modelo;

import java.util.ArrayList;



public class Disciplina {
	
	
	private String nomeDisc;
	private long codigoDisc;
	private int sala;
	private int cargaHoraria;
	private double custo;
	private Professor professor;

	//chamada listar o numero de alunos matriculados 	
	private ArrayList<Aluno> chamada = new ArrayList<Aluno>();
	
	
	
	////บบบ
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome,long codigo,Professor professor,int sala) {
	this.nomeDisc = nome;
	this.codigoDisc = codigo;
	this.professor = professor;
	this.sala = sala;
	
	}
    	
	


	public Disciplina(String nomeDisc, long codigoDisc, int sala, int cargaHoraria, double custo) {
		super();
		this.nomeDisc = nomeDisc;
		this.codigoDisc = codigoDisc;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		this.custo = custo;
		//this.professor = professor;
	}


////////////

	public String getNomeDisc() {
		return nomeDisc;
	}




	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}




	public long getCodigoDisc() {
		return codigoDisc;
	}




	public void setCodigoDisc(long codigoDisc) {
		this.codigoDisc = codigoDisc;
	}




	public int getSala() {
		return sala;
	}




	public void setSala(int sala) {
		this.sala = sala;
	}




	public int getCargaHoraria() {
		return cargaHoraria;
	}




	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}




	public double getCusto() {
		return custo;
	}




	public void setCusto(double custo) {
		this.custo = custo;
	}




	public Professor getProfessor() {
		return professor;
	}




	public void setProfessor(Professor professor) {
		this.professor = professor;
	}




	public ArrayList<Aluno> getChamada() {
		return chamada;
	}




	public void setChamada(ArrayList<Aluno> chamada) {
		this.chamada = chamada;
	}

	

	///metodos publicos 
	
	
// quando o aluno de cadastrar na disciplina ele vai para chamada	
	public void chamada(Aluno a) {
		chamada.add(a);
	}

   /////////////
	
	@Override
	public String toString(){
		return "Disciplina: " + nomeDisc + " codigo: " + codigoDisc + " sala: " + sala ;
	}

	public void mostraDisciplina() {
		System.out.println("Nome: " + this.nomeDisc);
		System.out.println("Codigo: " + this.codigoDisc);
		System.out.println("Sala: " + this.sala);
		System.out.println("Carga Horaria: " + this.cargaHoraria + "hrs");
		System.out.println("Curso: " + this.custo);
		//System.out.println("Professor Coordenador: " + this.professor);
	}
	
	

}
