package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.CandidatosRegister;
import entities.Vagas;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String maiorIdade = "";

		SimpleDateFormat dateNascimento = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite a quantidade candidatos que você quer cadastrar.");
		int users = sc.nextInt();

		if (users > 15) {
			System.out.println("Você ultrapassou  o limite permitido de " + users + " candidatos");
			System.out.print("Digite novamente  a quantidade de candidatos que você deseja cadastrar: ");
			users = sc.nextInt();
		}

		CandidatosRegister[] vect = new CandidatosRegister[15];

//		Criado apenas para preencher a base de dados para fazer a validação, pois o java não deixa testar objetos que constam como nulo,
//		mais estou sobrescrevendo  na criação de usuários.
		
		for (int user = 0; user < 15; user++) {
			vect[user] = new CandidatosRegister("Data", "Data", 45, "15/01/1998", new Vagas("Java"), 18);
		}

		for (int i = 0; i < users; i++) {
			sc.nextLine();

			System.out.println("Nome: ");
			String name = sc.nextLine();

			if (name.isEmpty()) {
				JOptionPane.showMessageDialog(null, "o campo Nome não foi preenchido");
				System.out.print("Você não preencheu o campo Nome:  ");
				name = sc.nextLine();
			}

			System.out.println("Sobrenome: ");
			String sobrenome = sc.nextLine();

			if (sobrenome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "o campo Sobrenome não foi preenchido");
				System.out.print("Você não preencheu o campo Sobrenome:  ");
				sobrenome = sc.nextLine();
			}

			System.out.println("CPF: ");
			int cpf = sc.nextInt();
			sc.nextLine();
//			Validação do cpf o própio console não deixa o usuário deixar em campo vazio.

			if (cpf > -1) {
				for (int j = 0; j < users; j++) {
					int userExist = vect[j].cpf;

					if (cpf == userExist) {
						System.out.println("Esse candidato já foi cadastrado, digite um cpf diferente: ");
						cpf = sc.nextInt();
						sc.nextLine();
					}
				}
			}

			System.out.println("Data de nascimento: ");
			String data = sc.nextLine();

			if (data.isEmpty()) {
				JOptionPane.showMessageDialog(null, "O campo Data não foi preenchido");
				System.out.print("Data de nascimento: ");
				data = sc.nextLine();
			}

			System.out.println("Digite a vaga que quer se candidatar: ");
			String vaga = sc.nextLine();

			if (vaga.isEmpty()) {
				JOptionPane.showMessageDialog(null, "O campo Vaga não foi preenchido");
				System.out.print("Vaga: ");
				vaga = sc.nextLine();
			}

//			--------------- Formatando data capturada pelo input --------------- 
			Date candidatoDate = dateNascimento.parse(data);
			String dateFormated = dateNascimento.format(candidatoDate);

			Date dateOfDay = new Date();
			String dateOfDayFormatted = dateNascimento.format(dateOfDay);

			int year = Integer.parseInt(dateOfDayFormatted.substring(6));
			int AnoDeNascimento = Integer.parseInt(dateFormated.substring(6));

			int idade = year - AnoDeNascimento;
			vect[i] = new CandidatosRegister(name, sobrenome, cpf, data, new Vagas(vaga), idade);

		}
				
		for (int showUsers = 0; showUsers < users; ++showUsers) {
			int getIdade = vect[showUsers].idade;

			if (getIdade >= 18) {
				maiorIdade = "Maior de idade";
			} else {
				maiorIdade = "Menor de idade";
			}

			Date dateForConsole = vect[showUsers].getData();
			System.out.println("Nome: " + vect[showUsers].getName() + ", Sobrenome: " + vect[showUsers].getSobrenome()
					+ ", Cpf: " + vect[showUsers].getCpf() + " Idade: " + vect[showUsers].getIdade()
					+ ", Data de Nascimento: " + dateNascimento.format(dateForConsole) + ", Vaga: "
					+ vect[showUsers].getVaga().getVaga1() + ", " + maiorIdade);
			
			System.out.println("Candidato cadastrado com successo!");
		}
		sc.close();
	}
}
