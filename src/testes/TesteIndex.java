package testes;

import java.util.Scanner;


public class TesteIndex {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		
		int ops = -9;
	
			while(ops != 0) {	
					
		
		System.out.println("Escolha uma opcao: \n ");
		System.out.println("(1) Aluno: ");
		System.out.println("(2) Curso: ");
		System.out.println("(3) Disciplina: ");
		System.out.println("(4) Professor: ");
		System.out.println("(0) Sair: ");
		
			ops = teclado.nextInt();
	
				switch(ops) {
			
			case 1: 
				System.out.println("\n**********Aluno**********\n");
				TesteAluno.main(args);
				break;
				
			case 2:
			
				System.out.println("\n**********Curso**********\n");
				TesteCurso.main(args);
				break;
				
			case 3:
				
				System.out.println("\n**********Disciplina**********\n");
				TesteDisciplina.main(args);
				break;
			case 4:
				System.out.println("\n**********Professor**********\n");
				TesteProfessor.main(args);
				break;
			case 0: 
				ops = 0 ;
				break;
				
			default:
				break;
				
		}
}
			
			
		
			teclado.close();
			
			
			
			
	}	
	
}


