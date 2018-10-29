package modelo;


 public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String matricula;
	private String endereco;
	private String email;
	private String telefone;
	
	
/////
	
	public Pessoa() {
		
	}


public Pessoa(String nome, String cpf, String endereco, String email, String telefone) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.endereco = endereco;
	this.email = email;
	this.telefone = telefone;
	
}

/////



public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getMatricula() {
	return matricula;
}


public void setMatricula(String matricula) {
	this.matricula = matricula;
}


public String getEndereco() {
	return endereco;
}


public void setEndereco(String endereco) {
	this.endereco = endereco;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelefone() {
	return telefone;
}


public void setTelefone(String telefone) {
	this.telefone = telefone;
}




///

@Override
public String toString() {
	return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", endereco=" + endereco + ", email="
			+ email + ", telefone=" + telefone + "]";
}


}
	





