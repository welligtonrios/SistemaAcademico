package service;

import java.util.ArrayList;

import modelo.Curso;
import modelo.Disciplina;
import modelo.Professor;

public class ServiceCurso {


	ArrayList<Disciplina> grade = new ArrayList<Disciplina>();
	
	
	public ArrayList<Disciplina>getListDisciplina(){
		return this.grade;
	}
	
	//CRUD
	
	//add disciplina 
	

public void addDisciplina(String nomeDisc, String codigoDisc, int sala, int cargaHoraria, double custo,Professor professor) {

Disciplina d = new Disciplina(nomeDisc, codigoDisc, sala, cargaHoraria, custo, professor);

	grade.add(d);

}
	
	
}
