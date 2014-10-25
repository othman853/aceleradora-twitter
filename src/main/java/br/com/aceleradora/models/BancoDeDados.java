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
	private static long lastId = 0;

	public BancoDeDados() {
		tweets = new ArrayList<Tweet>();
		usuarios = new ArrayList<Usuario>();
	}

	// public void adicionaPessoa(Usuario u){
	//
	// for(Usuario user: usuarios){
	// if(user.getNome().equals(u.getNome()))
	//
	//
	// }
	//
	// }

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
			tweet.setId(++lastId);
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

		System.out.println("Tweet not found. : " + id);
	}

	public void salvarAlteracoes(Tweet t) {
		for (Tweet tw : tweets) {
			if (tw.getId() == t.getId()) {
				tweets.set(tweets.indexOf(tw), t);
				return;
			}
		}
	}

	public List<Tweet> todosTweets() {
		return tweets;
	}
}
