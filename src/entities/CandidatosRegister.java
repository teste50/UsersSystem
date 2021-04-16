package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CandidatosRegister {
	public String name;
	public String sobrenome;
	public int cpf;
	public Date data;
	public Vagas vaga;
	public int idade;
	
	public CandidatosRegister (String name, String sobrenome, int cpf, String data, Vagas vaga, int idade  ) throws ParseException {
		this.name = name;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
		this.vaga = vaga;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Vagas getVaga() {
		return vaga;
	}

	public void setVaga(Vagas vaga) {
		this.vaga = vaga;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
