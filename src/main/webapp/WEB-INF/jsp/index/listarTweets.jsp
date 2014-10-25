<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tweets</title>
	
	<style>
		body{
			background-color: #ecf0f1;
		}
		
		.tweet{
			background-color:#2980b9;
			color: #ecf0f1;
			font-family:sans-serif;
			width:80%;
			margin:0 auto;
			padding:5px;
			margin-bottom:10px;
		}
			.tweet footer p{
				font-size:10px;
			}
		
		.button{
			display:inline-block;
			border:0;
			height:20px;
			width:100px;
			background-color:#1abc9c;
			color:#ecf0f1;
			font-family:sans-serif;
			text-decoration:none;
			padding:5px;
			transition:0.4s ease-in;
			text-align:center;
			line-height:20px;
			vertical-align:center;
		}
		
		
	</style>
</head>
<body>
	<a class="button" href="${linkTo[IndexController].index}"> Novo Tweet</a>

	<c:forEach items="${tweetList}" var="tweet">

		<div class="tweet">

			<article> <header>
			<h3>${tweet.nomeAutor}</h3>
			</header> <section>
			<p>${tweet.mensagem}</p>
			</section> 
			
			<footer>
			<p> ${tweet.dataHora} </p>
			<a class="button" href="${linkTo[IndexController].alterar}">Alterar</a>
			<a class="button" href="${linkTo[IndexController].remover}" >Remover</a>
			</footer>
			
			 </article>
		</div>
	</c:forEach>
	
</body>
</html>