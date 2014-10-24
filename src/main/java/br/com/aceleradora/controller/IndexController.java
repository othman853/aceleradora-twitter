package br.com.aceleradora.controller;

import java.util.List;

import br.com.aceleradora.models.BancoDeDados;
import br.com.aceleradora.models.Tweet;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;


@Resource
public class IndexController {
	
	private BancoDeDados banco;
	
	public IndexController(BancoDeDados banco){
		this.banco = banco;
		//banco = new BancoDeDados();
	}
	
	@Path("/")
	public void index(){
		
	}
	
	public void recebeDados(String dado, Result result){
		System.out.println(dado);
		result.include("v1", dado);
	}
	
	public List<Tweet> twitar (Tweet tweet, Result result){
		banco.adicionaTweet(tweet);
		return banco.todosTweets();
		//result.forwardTo(this).recebeDados(tweet.getMensagem(), result);
	}
}
