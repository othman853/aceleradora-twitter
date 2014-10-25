package br.com.aceleradora.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import br.com.aceleradora.models.BancoDeDados;
import br.com.aceleradora.models.Tweet;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	private BancoDeDados banco;

	public IndexController(BancoDeDados banco) {
		this.banco = banco;		
	}

	public void index() {}

	@Path("/")
	public List<Tweet> listarTweets() {

		return banco.todosTweets();
	}
		
	public void twitar(Tweet tweet, Result result) {
		banco.adicionaTweet(tweet);
		result.forwardTo(this).listarTweets();
	}

	public void remover(Tweet t, Result result) {
		banco.removerTweet(t);
		result.of(this).twitar(t, result);

		result.forwardTo(this).twitar(t, result);
	}
	
	public void alterar(Tweet t, Result r){
		
	}
}
