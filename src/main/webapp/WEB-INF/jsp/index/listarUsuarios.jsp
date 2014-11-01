<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${usuarioList}" var="usuario">

	<div class="tweet">

			<article class="well"> 
				<header>
					<h3>${usuario.nome} - ${usuario.tweets} tweets</h3>
				</header>			
			</article>
		</div>
	

</c:forEach>

</body>
</html>