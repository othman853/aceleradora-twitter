package br.com.aceleradora.models;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Tweet {	
	private long id;	
	private String mensagem;
	private String nomeAutor;
	private String dataHora;
	private long idAutor;
	
	public Tweet(){
		// obtem a data e a hora da criacao do tweet em um objeto DateTime
		DateTime momentoCriacao = new DateTime();
		
		//cria uma formatador para DateTime a partir do padrao especificado
		DateTimeFormatter formatadorData = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm");
		
		//O formatador retorna uma String com a data formatada e armazena no atributo dataHora
		dataHora = formatadorData.print(momentoCriacao);
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	
	//Este metodo sera utilizado somente para o caso de atualizacao de um tweet. a Data e hora de criacao serao sobrescritas.
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	
	public String getDataHora() {
		return dataHora;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}
	
	public long getIdAutor() {
		return idAutor;
	}
	
	
	public String toString(){
		return Long.toString(this.id) + " | " + this.nomeAutor + " | " + this.mensagem;
	}
	
}
