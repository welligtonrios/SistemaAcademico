package modelo;

public class Disciplina {
	
	
	private String nomeDisc;
	private String codigoDisc;
	private Professor professor;
	private int sala;
	private int cargaHoraria;
	private double custo;
	
		
	
	//chamada listar o numero de alunos matriculados 
	

	
	
	
	
	//construtor

	public Disciplina(String nomeDisc, String codigoDisc, Professor professor, int sala, int cargaHoraria,
			double custo) {
		super();
		this.nomeDisc = nomeDisc;
		this.codigoDisc = codigoDisc;
		this.professor = professor;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		this.custo = custo;
	}


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


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
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


	
	
	
	
	
	
	
	
	
	
	

}
