package testes;

import java.util.Scanner;

import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import service.ServiceAluno;
import service.ServiceCurso;
import service.ServiceDisciplina;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ServiceCurso serviceCurso = new ServiceCurso();
		serviceCurso.povoaCurso();
		ServiceAluno serviceAluno = new ServiceAluno();
		ServiceDisciplina serviceDisciplina = new ServiceDisciplina();
		serviceDisciplina.povoaDisciplina();
		
		int ops1=7;
		
		while(ops1 != 0) {
			
			System.out.println("Escolha uma opcao: \n ");
			System.out.println("(1) Adicionar Aluno ");
			System.out.println("(2) Listar Aluno: ");
			System.out.println("(3) Configurar Aluno: ");
			System.out.println("(4) Deletar aluno: ");
			System.out.println("(5) Adicionar Curso: ");
			System.out.println("(6) Adicionar Disciplina: ");
			System.out.println("(0) Sair: ");
			
			ops1 = teclado.nextInt();
		
		switch(ops1) {
		
		case 1:
			
			 System.out.println("Digite o nome do aluno");
			 String nome = teclado.next();
			 
			 System.out.println("Digite seu cpf");
			 String cpf = teclado.next();
			 
			 String matricula = cpf.substring(7, 11);
			 
			 System.out.println("Digite seu endereco: ");
			 String endereco = teclado.next();
			 
			 System.out.println("Digite seu Email");
		     String email = teclado.next();
		     
		     System.out.println("Digite seu Telefone");
		     String telefone = teclado.next(); 
		     serviceAluno.addaluno(nome, cpf, endereco, email, telefone, matricula);
		    
		     break;
		      
		case 2: 
			
			System.out.println("Digite a matricula do Aluno: ");
			serviceAluno.buscarAluno(matricula=teclado.next()).mostraAluno();
			break;
		case 3: 
			
			break;
			
		case 4:
			
			break;
		case 5: 
			
			System.out.println("Digite o Codigo do curso: ");
			long codigo;
			Curso c = serviceCurso.buscarCurso(codigo = teclado.nextLong());
			//se a curso nao for encontrado, volta para o menu inicial
			if(serviceCurso.buscarCurso(codigo)==null){
				ops1= 0;
				break;
			}
			System.out.println("Digite a matricula do Aluno: ");
			Aluno a = new Aluno();
			a = serviceAluno.buscarAluno(matricula = teclado.next());
			a.setCurso(c);			
			serviceAluno.addAluno(a);
			break;
		case 6:
			System.out.println("Codigo Disciplina");
			Disciplina d = serviceDisciplina.buscarDisciplina(codigo = teclado.nextLong());
			//se a disciplina nao for encontrada, volta para o menu inicial
			if(serviceDisciplina.buscarDisciplina(codigo)==null){
				ops1= 0;
				break;
			}
			
			System.out.println("Digite a matricula do Aluno: ");
			a = serviceAluno.buscarAluno(matricula = teclado.next());	
			a.addDisciplinaAluno(d);
			break;	
		
		case 0:
			ops1=0;
			break;
			
		default: 
			System.out.println("Opçao incorreta...");
			ops1= 0;
			break;
		
			
		}
	
}			
			
			

	}	

}
