<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--   <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/css/bootstrap.css" />">-->
 	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/css/bootstrap.css" />">
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/css/bootflat.css" />">
<title>Tweets</title>
	
	<style>
	
		body{
			background-color:#ecf0f1;
		}
	
		.well{
			background-color:#2980b9;
		}
		
		.well a{
			color: #ecf0f1;
		}
		
		.navbar{
			border-radius:0;
		}
		
		.user{			
			width:100%;
			clear:both;
			height:80px;
			color:#FFF;			
			
		}
		
			.user img{
				float:left;
				margin-right:10px;
				
			}
			
			.user h3{
				float:left;
				
			}
			
		.tweet section{
			margin-top:20px;			
			display:block;
			clear:both;
			color:#E1E1E1;
		}
		
		.tweet footer{
			color:#E1E1E1;
		}			
		
		
	</style>
</head>
<body>
	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a class="button" href="${linkTo[IndexController].index}"> Novo Tweet</a></li>
					<li><a class="button" href="${linkTo[IndexController].listarUsuarios}"> Usuários</a></li>
				</ul>
			</div>
		</div>
		
	</div>

	<c:forEach items="${tweetList}" var="tweet">

		<div class="tweet">

			<article class="well"> 
				<header>
					<div class="user">			
						<img src="<c:url value="/resources/img/profile.jpg" />"  width="100" height="80"/>	
						<h4> ${tweet.nomeAutor} </h4>
					</div>
				</header>
				 
				<section>
					<p>${tweet.mensagem}</p>
				</section> 
			
				<footer>
					<p> ${tweet.dataHora} </p>
					<a class="button" href="${linkTo[IndexController].alterar}?id=${tweet.id}">Alterar</a>
					<a class="button" href="${linkTo[IndexController].remover}?id=${tweet.id}" >Remover</a>
				</footer>			
			 </article>
		</div>
	</c:forEach>
	
</body>
</html>