package interfaces;

public abstract class Funcionario implements Trabalhador {

	private String matricula;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


}
