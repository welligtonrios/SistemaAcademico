package modelo;

import java.util.ArrayList;

public class Disciplina {
	
	
	private String nomeDisc;
	private String codigoDisc;
	private int sala;
	private int cargaHoraria;
	private double custo;
	private Professor professor;

	//chamada listar o numero de alunos matriculados 	
	private ArrayList<Aluno> chamada = new ArrayList<Aluno>();
	
	
	/////

	public Disciplina() {
		super();
	}




	public Disciplina(String nomeDisc, String codigoDisc, int sala, int cargaHoraria, double custo,
			Professor professor) {
		super();
		this.nomeDisc = nomeDisc;
		this.codigoDisc = codigoDisc;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		this.custo = custo;
		this.professor = professor;
	}


////////////

	public String getNomeDisc() {
		return nomeDisc;
	}




	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}




	public String getCodigoDisc() {
		return codigoDisc;
	}




	public void setCodigoDisc(String codigoDisc) {
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

///////////
	

	@Override
	public String toString() {
		return "Disciplina [nomeDisc=" + nomeDisc + ", codigoDisc=" + codigoDisc + ", sala=" + sala + ", cargaHoraria="
				+ cargaHoraria + ", custo=" + custo + ", professor=" + professor + ", chamada=" + chamada + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
