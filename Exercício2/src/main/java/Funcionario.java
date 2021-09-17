
public class Funcionario {
	private int setor;
	private String nome;
	private String CPF;
	
	public Funcionario() {
		setor = 0;
		nome = "";
		CPF = "";
	}
	public Funcionario(int setor, String nome, String CPF) {
		this.setor = setor;
		this.nome = nome;
		this.CPF = CPF;
	}
	public int getSetor() {
		return setor;
	}
	public void setSetor(int setor) {
		this.setor = setor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	@Override
	public String toString() {
		return "Funcionario [setor=" + setor + ", nome=" + nome + ", CPF=" + CPF + ", getSetor()=" + getSetor()
				+ ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + "]";
	}
	
}
