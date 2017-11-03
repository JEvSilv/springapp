package dados;

public class UsuarioDAO implements IRepositorioUsuario{
	RepositorioListaUsuarios repositorio;
	public UsuarioDAO() {
		this.repositorio = new RepositorioListaUsuarios();
	}

	@Override
	public Usuario buscarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		return this.repositorio.buscarUsuario(email, senha);
	}

	@Override
	public void inserir(Usuario u) {
		// TODO Auto-generated method stub
		this.repositorio.inserir(u);
	}

	@Override
	public void alterar(Usuario u1, Usuario u2) {
		// TODO Auto-generated method stub
		this.repositorio.alterar(u1, u2);
	}

	@Override
	public void remover(Usuario u) {
		// TODO Auto-generated method stub
		this.repositorio.remover(u);
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		this.repositorio.listar();
		return this.repositorio.listar();
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return this.repositorio.buscarPorEmail(email);
	}

	@Override
	public Usuario buscarPorLogin(String nome) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorLogin(nome);
	}
}
