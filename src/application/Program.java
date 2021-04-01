package application;

import java.util.Locale;
import java.util.Scanner;

import entities.UserRegister;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade usuários que você quer cadastrar.");
		int users = sc.nextInt(); 
		
		UserRegister[] vect = new UserRegister[users];
		
		for(int i=0; i < users; i++) {
			sc.nextLine();
			
			System.out.println("Nome: ");
			String name = sc.nextLine();
			
			System.out.println("Sobrenome: ");
			String sobrenome = sc.nextLine();
			
			System.out.println("CPF: ");
			int cpf = sc.nextInt();
			
			vect[i] = new UserRegister(name, sobrenome, cpf);
		}
		
//		apenas para visualizar no console as infos cadastradas
		System.out.println(vect[0].getName() + " " + vect[0].getSobrenome() +  " " + vect[0].getCpf());
		
		sc.close();
	}

}
