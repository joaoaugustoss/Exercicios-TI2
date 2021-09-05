
public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Funcionario usuario = new Funcionario(1, "pablo", "12345678910");
		if(dao.inserirFuncionario(funcionario) == true) {
			System.out.println("Inserção com sucesso -> " + funcionario.toString());
		}
		

		//Atualizar funcionário
		usuario.setSetor(2);
		dao.atualizarFuncionario(funcionario);

		//Mostrar funcionários
		System.out.println("==== Mostrar usuários === ");
		usuarios = dao.getFuncionario();
		for(int i = 0; i < funcionario.length; i++) {
			System.out.println(funcionario[i].toString());
		}
		
		//Excluir funcionário
		dao.excluirFuncionario(usuario.getNome());
		
		//Mostrar funcionário
		funcionario = dao.getFuncionario();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < funcionario.length; i++) {
			System.out.println(funcionario[i].toString());
		}
		
		dao.close();
	}
}