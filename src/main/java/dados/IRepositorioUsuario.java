package dados;

public interface IRepositorioUsuario {
	Usuario buscarUsuario(String email, String senha);
	void inserir(Usuario u);
	void alterar(Usuario u1, Usuario u2);
	void remover(Usuario u);
	String listar();
	Usuario buscarPorEmail(String email);
	Usuario buscarPorLogin(String nome);
}
