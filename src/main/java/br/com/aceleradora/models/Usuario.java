package br.com.aceleradora.models;

public class Usuario {
	private long id;
	private String nome;
	private String foto;
	private int tweets;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setTweets(int tweets) {
		this.tweets = tweets;
	}
	
	public int getTweets() {
		return tweets;
	}

}
