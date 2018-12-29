package testes;

import java.util.Scanner;
import service.ServiceCurso;

public class TesteCurso {

	public static void main(String[] args) {
	
		
			Scanner teclado = new Scanner(System.in);
		
		
		ServiceCurso serviceCurso = new ServiceCurso();
		serviceCurso.povoaCurso();
		
		int ops1 = 7;
	
			while(ops1 != 0) {	
					
		
		System.out.println("Escolha uma opcao: \n ");
		System.out.println("(1) adicionar um Curso ");
		System.out.println("(2) Listar Curso");
		System.out.println("(3) Configurar Curso");
		System.out.println("(4) Deletar Curso");
		System.out.println("(5) Listar grande do Curso");
		System.out.println("(0) Sair \n");
		
			ops1 = teclado.nextInt();
	
				switch(ops1) {
			
			case 1 : 
				
				 System.out.println("Digite o nome do Curso");
				 String nome = teclado.next();
				 System.out.println("Digite o codigo: ");
				 long codigo = teclado.nextLong();
				 System.out.println("Digite o turno: ");
				 String turno = teclado.next();
				 
				 serviceCurso.addCurso(nome, codigo, turno);
			     
			     break;
			      
			case 2 :
				System.out.println("Digite o codigo do curso: ");
				serviceCurso.buscarCurso(codigo = teclado.nextLong()).mostraCurso();    
			
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				ops1=0;
				break;
				
				
			default:
				System.out.println("Opçao incorreta...");
				ops1 = 0 ;
				break;
					
				
					}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		

	}

}
