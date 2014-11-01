package br.com.aceleradora.controller;

import java.util.List;

import br.com.aceleradora.models.BancoDeDados;
import br.com.aceleradora.models.Tweet;
import br.com.aceleradora.models.Usuario;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	private BancoDeDados banco;

	@Path("/")
	public List<Tweet> listarTweets() {

		return banco.todosTweets();
	}
	
	public List<Usuario> listarUsuarios(){
		return banco.todosUsuarios();
	}

	public IndexController(BancoDeDados banco) {
		this.banco = banco;
	}

	public Tweet index(Tweet t, Result r) {		
		return t;
	}

	public void alterar(long id, Result r) {
		r.forwardTo(this).index(banco.findTweet(id), r);
	}

	public void twitar(Tweet tweet, Result result) {
		banco.adicionaTweet(tweet);
		result.forwardTo(this).listarTweets();
	}

	public void remover(long id, Result result) {
		banco.removerTweet(id);
		result.forwardTo(this).listarTweets();
	}

}
