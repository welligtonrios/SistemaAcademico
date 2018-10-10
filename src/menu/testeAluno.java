package menu;

import java.util.Scanner;

import service.ServiceAluno;

public class testeAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		ServiceAluno serviceAluno = new ServiceAluno();
		
		int ops = 1;
		
		while(ops != 0) {
			
			System.out.println("Escolha uma opção: \n ");
			System.out.println("(1) adicionar um aluno ");
			System.out.println("(2) Buscar contato");
			System.out.println("(3) Alterar contato");
			System.out.println("(4) Deletar contato");
			System.out.println("(5) Listar contatos");
			System.out.println("(0) Sair \n");
			
			ops = teclado.nextInt();
			
			switch(ops) {
			
			case 1 : 
				
				 System.out.println("Digite o nome do aluno");
				 String nome = teclado.nextLine();
				 System.out.println("Digite seu cpf");
				 String cpf = teclado.nextLine();
			     System.out.println("Digite seu Endereco");
			     String endereco = teclado.nextLine();
			     serviceAluno.addAluno(nome, cpf, endereco);
			     break;
			     
			     
			case 5 : 
				
				 serviceAluno.listarAluno();
			
			
			}
			
			
			
			
			
			
		}
		
		

	}

}
