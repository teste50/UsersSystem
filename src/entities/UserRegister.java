package entities;

//import java.util.Date;

public class UserRegister {
	public String name;
	public String sobrenome;
	public int cpf;
//	public Date data;
	
	public UserRegister (String name, String sobrenome, int cpf ) {
		this.name = name;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		
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

//	public Date getData() {
//		return data;
//	}

//	public void setData(Date data) {
//		this.data = data;
//	}
	
	
}
