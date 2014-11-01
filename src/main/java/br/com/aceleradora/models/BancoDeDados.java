package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@SessionScoped
@Component
public class BancoDeDados {

	private List<Tweet> tweets;
	private List<Usuario> usuarios;
	private static long ultimoIdTweet = 0;
	private static long ultimoIdUsuario = 0;

	public BancoDeDados() {
		tweets = new ArrayList<Tweet>();
		usuarios = new ArrayList<Usuario>();
	}

	public long adicionaUsuario(String nome) {		

		for (Usuario user : usuarios) {
			if(user.getNome().equals(nome))
				return user.getId();
		}
		
		Usuario u = new Usuario();
		u.setId(++ultimoIdUsuario);
		u.setNome(nome);
		usuarios.add(u);
		
		return u.getId();
	}

	public Tweet findTweet(long id) {
		for (Tweet tw : tweets) {
			if (tw.getId() == id)
				return tw;
		}

		return null;
	}

	public void adicionaTweet(Tweet tweet) {
		if (findTweet(tweet.getId()) != null) {

			salvarAlteracoes(tweet);
		} else {			
			tweet.setId(++ultimoIdTweet);
			tweet.setIdAutor(adicionaUsuario(tweet.getNomeAutor()));
			tweets.add(tweet);
		}
	}

	public void removerTweet(long id) {
		for (Tweet tw : tweets) {
			if (tw.getId() == id) {
				tweets.remove(tweets.indexOf(tw));
				return;
			}
		}		
	}

	//Pode estar salvando o idAutor errado
	public void salvarAlteracoes(Tweet t) {
		for (Tweet tw : tweets) {
			if (tw.getId() == t.getId()) {
				tweets.set(tweets.indexOf(tw), t);
				break;
			}
		}
	}
	
	public int contarTweetsUsuario(long idUsuario){
		int tweets = 0;
		for(Tweet t : this.tweets){
			if(t.getIdAutor() == idUsuario)
				tweets ++;
		}
		
		return tweets;
	}

	public List<Tweet> todosTweets() {
		return tweets;
	}
	
	

	public List<Usuario> todosUsuarios() {
		for(Usuario u : usuarios){
			u.setTweets(this.contarTweetsUsuario(u.getId()));
		}
		return this.usuarios;
	}
}
