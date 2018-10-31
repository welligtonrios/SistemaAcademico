package modelo;

import java.util.ArrayList;

public class Curso {
//////
	
	private String nome;
	private String  codigo;
	private String turno;
	private Professor professorCoordenador;

	//lista de diciplina do curso 

	ArrayList<Disciplina>grade= new ArrayList<Disciplina>();
	
	
	///////
	
	public Curso() {
		super();
	}
	
	
	
public Curso(String nome, String codigo, String turno, Professor professorCoordenador) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.professorCoordenador = professorCoordenador;
	}

///////////

public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public String getCodigo() {
	return codigo;
}



public void setCodigo(String codigo) {
	this.codigo = codigo;
}



public String getTurno() {
	return turno;
}



public void setTurno(String turno) {
	this.turno = turno;
}



public Professor getProfessorCoordenador() {
	return professorCoordenador;
}



public void setProfessorCoordenador(Professor professorCoordenador) {
	this.professorCoordenador = professorCoordenador;
}



public ArrayList<Disciplina> getGrade() {
	return grade;
}



public void setGrade(ArrayList<Disciplina> grade) {
	this.grade = grade;
}







////////

	
@Override
public String toString() {
	return "Curso [nome=" + nome + ", codigo=" + codigo + ", turno=" + turno + ", professorCoordenador="
			+ professorCoordenador + ", grade=" + grade + "]";
}
	

	
	








	
	
	
	
	
}
