package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CandidatosRegister {
	public String name;
	public String sobrenome;
	public String cpf;
	public Date data;
	public Vagas vaga;
	public int idade;
	
	public CandidatosRegister (String name, String sobrenome, String cpf, String data, Vagas vaga, int idade  ) throws ParseException {
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

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
