package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.UserRegister;

public class Program {

	public static void main(String[] args) throws ParseException {
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
			sc.nextLine();
			
			System.out.println("Data de nascimento: ");
			String data = sc.nextLine();
			
			vect[i] = new UserRegister(name, sobrenome, cpf, data);
		}
		
		
		SimpleDateFormat dateNascmineto = new SimpleDateFormat("dd/MM/yyyy");
		Date formatedDate = vect[0].getData();
	
//		apenas para visualizer no console as infos cadastradas
		System.out.println(vect[0].getName() + " " + vect[0].getSobrenome() +  " " + vect[0].getCpf() + " " + dateNascmineto.format(formatedDate));
		
		sc.close();
	}

}
