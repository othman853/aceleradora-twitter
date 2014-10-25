<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Registro Livre</title>
	
	<style>
		body{
			background-color:#ecf0f1;
		}
		
		form{
			background-color:#2980b9;
			color:#ecf0f1;
			width:45%;
			margin:0 auto;
			padding:5px;
		}
		
		.form-component{
			display:block;
			width:80%;
			margin:0 auto;
			margin-bottom:10px;
			height:20px;
			
			font-family:sans-serif;
			font-size:16px;
		}
		
		.text-box{
			border:0;						
		}
		
		.text-area{
			max-width:80%;
			height:100px;
			max-height:150px;
		}
		
		.button{
			border:0;
			height:30px;
			width:50%;
			background-color:#1abc9c;
			color:#ecf0f1;
			transition:0.4s ease-in;
		}
		
			.button:hover{
				background-color:#2ecc71;
			}
		
		
		
	</style>
</head>
<body>
	<form action = "${linkTo[IndexController].twitar}" method = "post">
		<label class="form-component"> Autor: </label>		
		<input class="form-component text-box" type = "text" name = "tweet.nomeAutor" value="${tweet.nomeAutor}">
		
		<label class="form-component"> Tweet: </label> 
		<textarea class="form-component text-box text-area" name="tweet.mensagem" value="${tweet.mensagem}"> </textarea> 		
		
		<input class="form-component button" type = "submit" value = "Enviar">
	</form>
</body>
</html>