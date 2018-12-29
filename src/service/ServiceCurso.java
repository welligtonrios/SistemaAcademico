package service;

import java.util.ArrayList;
import java.util.List;

import modelo.Curso;

public class ServiceCurso {


List<Curso> listCursos = new ArrayList<>();


public void addCurso(String nome, long codigo, String turno) {
	
	Curso c = new Curso(nome,codigo,turno);
	listCursos.add(c);
	
}

public Curso buscarCurso(long codigo) {
	
	for (Curso curso : listCursos) {
		      if(curso.getCodigo() == codigo ) {
			return curso;
		}
	}
	
	System.out.println("curso nao encontrado :(...");
	return null;
}

public void povoaCurso() {

	Curso  c = new Curso("Ciencias da computaçao",12,"noite");
	Curso  c1 = new Curso("Sistemas",13,"noite");
	Curso  c2 = new Curso("Redes",14,"noite");
	listCursos.add(c);
	listCursos.add(c1);
	listCursos.add(c2);
	
}









	
}
