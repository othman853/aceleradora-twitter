<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style>
		body{
			background-color:#ecf0f1;
		}
		.panel-default{
			margin-top:85px;			
		}
		
		
	</style>
	<!--  <link rel="stylesheet" href="<c:url value="/resources/css/index.css" />">-->
	 <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/css/bootstrap.css" />">
	 <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/css/bootflat.css" />">
	
	<title>Registro Livre</title>
		
</head>
<body>
	<form class="form" action = "${linkTo[IndexController].twitar}" method = "post">
		<input type="text" name="tweet.id" value="${tweet.id }" hidden/>
		<div class="container">
			<div class="panel panel-default">
				<div class="form-group">
					<label class="label"> Autor: </label>		
					<input class="form-control" type="text" name="tweet.nomeAutor" value="${tweet.nomeAutor}">
				</div>
				
				<div class="form-group">				
					<label class="label"> Tweet: </label> 
					<textarea class="form-control text-box text-area" name="tweet.mensagem" >${tweet.mensagem}</textarea>
				</div>
			 		
				<div class="panel-footer">
					<input class="btn btn-primary" type = "submit" value = "Enviar">
				</div>
			</div>
		</div>
	</form>
</body>
</html>