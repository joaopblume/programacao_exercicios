
public class Aluno extends Pessoa{

	private String matricula;
	private String curso;
	
	public Aluno(String nome, String endereco, String nacionalidade) {
		super(nome, endereco, nacionalidade);
	}
	
	public Aluno(String nome, String endereco, String nacionalidade,
			 String matricula, String curso) {
		super(nome, endereco, nacionalidade);
		
		this.matricula = matricula;
		this.curso = curso;
	}
	

	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void imprimeDados() {
		super.imprimeDados();
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Curso: " + getCurso());
	}
}
