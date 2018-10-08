package service;

import java.util.ArrayList;

import modelo.Curso;
import modelo.Professor;

public class ServiceCurso {

	
	public ArrayList<Curso> listCurso = new ArrayList<Curso>();

	public ArrayList<Curso> getCurso() {
		return listCurso;
	}
	
	
	// verificando se ah cursos 
	
	
	public Curso verCurso(int i) {
		
		i += -1;
		return listCurso.get(i);
		
	} 
	
	
	public boolean verificandoExistenciaCurso() {
		if (listCurso.isEmpty()) {
			System.out.println("Nao ha nenhum curso. Casdastre ja seu curso ");
			return false;
		}else {
			return true;
		}
		
		
	}
	
	
	//Listar curso
	
	
	public void listarCurso() {
		
		if (listCurso.isEmpty()) {
			
			System.out.println("Nao ha nenhum curso. Casdastre ja seu curso ");
		}else {
			for (Curso curso : listCurso) {
				//add
			}
		}
	
		
		
	}
	
	
	
	//ADD um curso 
	
	public void adicionarCurso(String nome , int codigo, String turno, String professorCordeenador) {
		
		Curso curso = new Curso();
		
	curso.setNome(nome);
	curso.setTurno(turno);
	curso.setProfessorCordeenador(professorCordeenador);
	curso.setCodigo(codigo);
	
	listCurso.add(curso);	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//cadastrar o curso
	

	
	
	
	
	
	
	
	
}
