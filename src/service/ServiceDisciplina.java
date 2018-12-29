package service;

import java.util.ArrayList;
import java.util.List;

import modelo.Disciplina;

public class ServiceDisciplina {
	
	
	List<Disciplina> lisDisciplina = new ArrayList<>();

	public List<Disciplina> getLisDisciplina() {
		return lisDisciplina;
	}
		
	////CRUD


	public void addDisciplina(String nome,long codigo,int sala,int cargaHoraria,double custo) {
		Disciplina disciplina = new Disciplina(nome,codigo,sala,cargaHoraria,custo);
		lisDisciplina.add(disciplina);
	}
	
	public Disciplina buscarDisciplina(long codigo) {
		
		for (Disciplina disciplina : lisDisciplina) {
			if (disciplina.getCodigoDisc()==codigo) {
				return disciplina;
			}	
		}
      System.out.println("Disciplina não encontrada :(....");
      return null;
}
	
public void povoaDisciplina() {
	
	 Disciplina d = new Disciplina("POO",10,103,36,200.00);
	 Disciplina d1 = new Disciplina("POO1",11,104,36,200.00);
	 Disciplina d2 = new Disciplina("POO2",12,105,36,200.00);
	 Disciplina d3 = new Disciplina("POO3",13,106,36,200.00);
	 Disciplina d4 = new Disciplina("POO4",14,107,36,200.00);
	 Disciplina d5 = new Disciplina("POO5",15,108,36,200.00);
	 Disciplina d6 = new Disciplina("POO6",16,109,36,200.00);
	 lisDisciplina.add(d);
	 lisDisciplina.add(d1);
	 lisDisciplina.add(d2);
	 lisDisciplina.add(d3);
	 lisDisciplina.add(d4);
	 lisDisciplina.add(d5);
	 lisDisciplina.add(d6);
	
	
	
	
	
}
	
	
	
	
	
	
}