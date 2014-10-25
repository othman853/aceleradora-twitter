package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@SessionScoped
@Component
public class BancoDeDados {
	
	private List<Tweet> tweets;
	private List<Usuario> usuarios;
	private static long lastId = 0;
	
	public BancoDeDados(){
		tweets = new ArrayList<Tweet>();
		usuarios = new ArrayList<Usuario>();
	}
	
//	public void adicionaPessoa(Usuario u){
//		
//		for(Usuario user: usuarios){
//			if(user.getNome().equals(u.getNome()))
//				
//			
//		}
//		
//	}
	
	public void adicionaTweet (Tweet tweet){
		tweet.setId(++lastId);		
		tweets.add(tweet);
	}
	
	public void removerTweet(Tweet tweet){
		tweets.remove(tweets.indexOf(tweet));
	}
	
	public List<Tweet> todosTweets(){
		return tweets;
	}
}
