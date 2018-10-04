package modelo;

public class Disciplina {
	
	
	private String nomeDisc;
	private long codigoDisc;
	private String nomeProff;
	
	
	
	
	
	public Disciplina(String nomeDisc, long codigoDisc, String nomeProff) {
		super();
		this.nomeDisc = nomeDisc;
		this.codigoDisc = codigoDisc;
		this.nomeProff = nomeProff;
	}



  //getters

	public String getNomeDisc() {
		return nomeDisc;
	}


	public long getCodigoDisc() {
		return codigoDisc;
	}


  //getters e settres pro professor, pois eu posso ter um novo professor a disciplina
	public String getNomeProff() {
		return nomeProff;
	}



	public void setNomeProff(String nomeProff) {
		this.nomeProff = nomeProff;
	}
	
	
	
	

}
