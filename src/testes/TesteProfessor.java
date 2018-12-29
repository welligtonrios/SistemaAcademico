package testes;

import java.util.Scanner;

import service.ServiceProfessor;

public class TesteProfessor {

	public static void main(String[] args) {
		
		
Scanner teclado = new Scanner(System.in);
		
		
		ServiceProfessor serviceProfessor = new ServiceProfessor();
		
		int ops = 7;
	
			while(ops != 0) {	
					
		
		System.out.println("Escolha uma opcao: \n ");
		System.out.println("(1) adicionar um Professor ");
		System.out.println("(2) Listar Professor");
		System.out.println("(3) Configurar Professor");
		System.out.println("(4) Deletar Professor");
		System.out.println("(0) Sair \n");
		
			ops = teclado.nextInt();
	
				switch(ops) {
			
			case 1 : 
				
				 System.out.println("Digite o nome do Professor");
				 String nome = teclado.next();
				 System.out.println("Digite seu cpf");
				 String cpf = teclado.next();
				 System.out.println("Digite seu endereço: ");
				 String endereco = teclado.next();
			     System.out.println("Digite seu Email");
			     String email = teclado.next(); 
			     System.out.println("Digite seu Telefone");
			     String telefone = teclado.next();
			     serviceProfessor.addProfessor(nome, cpf, endereco, email, telefone);
			     
			     break;
			      
			case 2 :
				System.out.println("Digite o nome do Professor: ");
			 serviceProfessor.buscarProfessor(nome = teclado.next()).mostraProfessor();
				break;

			case 3:
				break;
			case 4:
				break;
			case 0:
				ops=0;
				break;
				
				
			default:
				System.out.println("Opçao incorreta...");
				ops = 0 ;
				break;
					
		
			
					}
			}
			
			
			
			
			
			
			
	


	}

}
