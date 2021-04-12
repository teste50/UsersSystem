package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CandidatosRegister;
import entities.Vagas;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat dateNascimento = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Digite a quantidade candidatos que você quer cadastrar.");
		int users = sc.nextInt(); 
		
		if(users > 15) {
			System.out.println("Você ultrapassou  o limite permitido de " +users+ " candidatos");
			System.out.print("Digite novamente  a quantidade de candidatos que você deseja cadastrar: ");
			users = sc.nextInt();
		}
		
		CandidatosRegister[] vect = new CandidatosRegister[users];
		
		for(int i=0; i < users; i++) {
			sc.nextLine();
			
			
			System.out.println("Nome: ");
			String name = sc.nextLine();
			
			if(name == "") {
				System.out.println("Você não preencheu  o nome digite novamente: ");
				name = sc.nextLine();
			}
			
			
			System.out.println("Sobrenome: ");
			String sobrenome = sc.nextLine();
			
			if(sobrenome == "") {
				System.out.println("Você não preencheu  o sobrenome digite novamente: ");
				sobrenome = sc.nextLine();
			}
			
			
			System.out.println("CPF: ");
			String cpf = sc.nextLine();			
			
			if(cpf == "") {
				System.out.println("Você não preencheu  o cpf digite novamente: ");
				cpf = sc.nextLine();
			}
			
			
			System.out.println("Data de nascimento: ");
			String data = sc.nextLine();
			
			if(data == "") {
				System.out.println("Você não preencheu  a data digite novamente: ");
				data = sc.nextLine();
			}
			
			
			System.out.println("Digite a vaga que quer se candidatar: ");
			String vaga = sc.nextLine();
			
			if(vaga == "") {
				System.out.println("Você não preencheu  a vaga digite novamente: ");
				vaga = sc.nextLine();
			}
			
//			--------------- Formatando data capturada pelo input --------------- 
			Date candidatoDate = dateNascimento.parse(data);
			String dateFormated = dateNascimento.format(candidatoDate);
			
			Date dateOfDay =  new Date();
			String dateOfDayFormatted = dateNascimento.format(dateOfDay);
			
			int year = Integer.parseInt(dateOfDayFormatted.substring(6));
			int AnoDeNascimento = Integer.parseInt(dateFormated.substring(6));
			
			int idade = year - AnoDeNascimento;
			
			
			vect[i] = new CandidatosRegister(name, sobrenome, cpf, data, new Vagas(vaga), idade);		
			
			
			Date dateForConsole = vect[i].getData();
			System.out.println("Nome: "+ vect[i].getName() + ", Sobrenome: " + vect[i].getSobrenome() +  ", Cpf: " + vect[i].getCpf() + " Idade: " + vect[i].getIdade() + ", Data de Nascimento: " + dateNascimento.format(dateForConsole) + ", Vaga: " + vect[i].getVaga().getVaga1());
			
		}
		
		System.out.println("Candidatos cadastrados com sucesso!");
			
		sc.close();
	}

}
