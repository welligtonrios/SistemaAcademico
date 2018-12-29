package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
//////
	
	private String nome;
	private long codigo;
	private String turno;
	private Professor professorCoordenador;

	//lista de diciplina do curso 

	ArrayList<Disciplina>grade= new ArrayList<Disciplina>();
	
	
	///////
	
	public Curso() {
		
	}
	
	
	public Curso(String nome, Professor professorCoordenador ) {
		this.nome = nome;
		this.professorCoordenador = professorCoordenador;


	}
	

public Curso(String nome, long codigo, String turno) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		//this.professorCoordenador = professorCoordenador;
	}

///////////

public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public long getCodigo() {
	return codigo;
}



public void setCodigo(long codigo) {
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



//////// metodos publicos 


public void addDiciplina(Disciplina d) {
	grade.add(d);
	
}


///////////////// receber o coigo do curso

public void codigo(long codigoCusro) {
	   
	   Scanner teclado = new Scanner(System.in);
	   
	   int a=-7;
    while( a != 1 ) {
    	 System.out.println("digite o cogigo da disciplina: ");
    	 codigoCusro = teclado.nextLong();
         String s2 = String.valueOf(codigoCusro); 
         
    	if(s2.length() > 4 | s2.length() < 4) {
        	System.out.println("digite codigo de 4 digitos ");
        	a = -8;
        }else{
            
        	System.out.println("codigo sucesso ");
        	 a = 1;
        }
    	
    }
	   
}

@Override
public String toString() {
	return "Curso: " + nome  + "\ngrade: " + getGrade();
}

public void mostraCurso() {
	System.out.println("Curso: "+ this.nome + " Turno: " + this.turno);
}
	
	

	
	








	
	
	
	
	
}
