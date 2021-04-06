import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		//Declaro o Scanner como entrada atraves do in , ou seja , como entrada de dados atraves do teclado
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 1 para somar: ");
		System.out.println("Digite 2 para subtrair: ");
		System.out.println("Digite 3 para multiplicar: ");
		System.out.println("Digite 4 para dividir: ");
		
		
		// Aqui ele pega o numero ou valor digitado e executa a proxima ação. 
		int i = in.nextInt();
		
		// a partir daqui eu coloco duas condições onde peço o numero para as operações serem feitas
		System.out.println("Digite o primeiro numero:");
		double num1 = in.nextDouble();
		
		System.out.println("Digite o primeiro numero:");
		double num2 = in.nextDouble();
		
		
		// aqui declaro a condição usando o laço do if e else.
		if (i == 1 ) {
			System.out.println(num1 + num2);
		}else {
			if(i == 2) {
				System.out.println(num1 - num2);
			}else {
				if( i == 3) {
					System.out.println(num1 * num2);
				}else {
					if( i == 4) {
						System.out.println(num1 / num2);
					}
				}
			}
		}	
	}

}
