package modelo;

import java.util.ArrayList;

public class Curso {

	
	private String nome;
	private int  codigo;
	private String turno;
	private Professor ProfessorCordeenador;
	
	//lista de diciplina do curso 
	ArrayList<Disciplina> grandeCurso = new ArrayList<Disciplina>();

	public ArrayList<Disciplina> getGrandeCurso() {
		return grandeCurso;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Professor getProfessorCordeenador() {
		return ProfessorCordeenador;
	}

	public void setProfessorCordeenador(Professor professorCordeenador) {
		ProfessorCordeenador = professorCordeenador;
	}

	
	
	
	
	
	
	
	
}
