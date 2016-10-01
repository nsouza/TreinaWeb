<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<<<<<<< HEAD
    <%@ page buffer="8192kb" %>
=======
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Treinamento SpringFramework</title>
</head>
<body>
<h2>Inserção de novo album "${album.nome}"</h2>
	<br />
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
	<c:url var="actionAdicionar" value="/albuns/adicionar"></c:url>
	<form:form action="${actionAdicionar}" method="post"
		modelAttribute="album">
			<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<label>Nome:</label>
					<form:input path="nome" cssClass="form-control"/>
<<<<<<< HEAD
					<form:errors path="nome" cssStyle="color: red"></form:errors>
				</div>
			</div>
		</div>
		
=======
					<form:errors path="nome" cssClass="color: red"></form:errors>
				</div>
			</div>
		</div>
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
		<div class="row">
			<div class="col-md-6">
				<div class="form-group">
					<label>Ano de Lançamento::</label>
					<form:input path="anoDeLancamento" cssClass="form-control"/>
<<<<<<< HEAD
					<form:errors path="anoDeLancamento" cssStyle="color: red"></form:errors>
=======
					<form:errors path="anoDeLancamento" cssClass="color: red"></form:errors>
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
				</div>
			</div>
		</div>
		<input type="submit" value="Salvar" class="btn btn-default">

	</form:form>
<<<<<<< HEAD

=======
</body>
</html>
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56













