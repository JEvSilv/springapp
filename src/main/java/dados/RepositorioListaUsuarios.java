package dados;

import java.util.ArrayList;

public class RepositorioListaUsuarios implements IRepositorioUsuario{
	ArrayList<Usuario> repositorio;
	
	public RepositorioListaUsuarios() {
		this.repositorio = new ArrayList<Usuario>();
	}

	@Override
	public Usuario buscarUsuario(String email, String senha) {
		// TODO Auto-generated method stub
		for(Usuario u : this.repositorio) {
			if(u.email.equals(email) && u.email.equals(senha)){
				return u;
			}
		}
		return null;
	}

	@Override
	public void inserir(Usuario u) {
		// TODO Auto-generated method stub
		this.repositorio.add(u);
		
	}

	@Override
	public void alterar(Usuario u1, Usuario u2) {
		// TODO Auto-generated method stub
		if(this.repositorio.remove(u1));
			this.repositorio.add(u2);
	}

	@Override
	public void remover(Usuario u) {
		// TODO Auto-generated method stub
		this.repositorio.remove(u);
	}

	@Override
	public String listar() {
		// TODO Auto-generated method stub
		String str = "";
		for(Usuario u : this.repositorio) {
			str += "Nome: " + u.nome;
			str += "Email: " + u.email;
		}
		return str;
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		for(Usuario u : this.repositorio) {
			if(u.email.equals(email)){
				return u;
			}
		}
		return null;
	}

	@Override
	public Usuario buscarPorLogin(String nome) {
		// TODO Auto-generated method stub
		for(Usuario u : this.repositorio) {
			if(u.email.equals(nome)){
				return u;
			}
		}
		return null;
	}
	
	
}
