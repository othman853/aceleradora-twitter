package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@SessionScoped
@Component
public class BancoDeDados {
	
	private List<Tweet> tweets;
	
	public BancoDeDados(){
		tweets = new ArrayList<Tweet>();
	}
	
	public void adicionaTweet (Tweet tweet){
		tweets.add(tweet);
	}
	
	public List<Tweet> todosTweets(){
		return tweets;
	}
}
