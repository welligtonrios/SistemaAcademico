package modelo;

public class Curso {

	
	private String nome;
	private String  codigo;
	private String turno;
	private Professor professorCoordenador;

	
	//lista de diciplina do curso 

	
	
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

	

	
	
	
	
	
	
	
	
}
