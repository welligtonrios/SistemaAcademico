package modelo;

public class Situacao {

	private boolean situacao;
	
	public boolean situcao(Aluno aluno) {
		if(aluno.getDisciplina().size()== 0) {
			this.situacao = false;
			 System.out.println("efetue ja sua matricula");
			return situacao;
		}else {
			situacao = true;
			System.out.println("'Aluno matriculado");
			return situacao;
		}
		
	}
	
	
	
	
	
	

	public boolean isSituacao() {
		return situacao;
	}


	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	
	
}
