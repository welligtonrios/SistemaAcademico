package testes;

import java.util.Scanner;

import service.ServiceDisciplina;

public class TesteDisciplina {

	public static void main(String[] args) {
		
		
		
Scanner teclado = new Scanner(System.in);
		
		
		ServiceDisciplina serviceDisciplina = new ServiceDisciplina();
		
		int ops = 7;
	
			while(ops != 0) {	
					
		
		System.out.println("Escolha uma opcao: \n ");
		System.out.println("(1) adicionar um Disciplina ");
		System.out.println("(2) Listar Disciplina");
		System.out.println("(3) Configurar Disciplina");
		System.out.println("(4) Deletar Disciplina");
		System.out.println("(0) Sair \n");
		
			ops = teclado.nextInt();
	
				switch(ops) {
			
			case 1 : 
				
				 System.out.println("Digite o nome da Disciplina");
				 String nome = teclado.next();
				 System.out.println("Digite o codigo: ");
				 long codigo = teclado.nextLong();
				 System.out.println("Digite a Sala:  ");
				 int sala = teclado.nextInt();
				 System.out.println("Digite a carga Horaria: ");
				 int cargaHoraria = teclado.nextInt();
				 System.out.println("Digite o Custo da Disciplina: ");
				 double custo = teclado.nextDouble();
				 serviceDisciplina.addDisciplina(nome, codigo, sala, cargaHoraria, custo);
			     
			     break;
			      
			case 2 :
				System.out.println("Digite o codigo do Disciplina: ");
				serviceDisciplina.buscarDisciplina(codigo = teclado.nextLong()).mostraDisciplina();
				
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
