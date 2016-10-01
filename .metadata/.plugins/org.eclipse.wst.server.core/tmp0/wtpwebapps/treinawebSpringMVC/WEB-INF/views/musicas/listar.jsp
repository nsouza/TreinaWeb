<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h2>Listagem de Musicas</h2>
<br />
<table class="table">
	<thead>
		<th>ID</th>
		<th>Nome do Musica</th>
		<th>Ano do Lan�amento</th>
		<th>A��es</th>
	</thead>
	<tbody>
		<c:if test="${!empty musicas}">
			<c:forEach items="${musicas}" var="musica">
				<tr>
					<td>${musica.id}</td>
					<td>${musica.nome}</td>
					<td><fmt:formatDate value="${musica.dataCriacao}" pattern="dd/MM/YYYY" timeZone="UTC"/></td>
					<td>${musica.album.nome}</td>
					<td>
						<a href="/treinawebSpringMVC/musicas/alterar/${musica.id}">Alterar</a> | 
						<a href="/treinawebSpringMVC/musicas/excluir/${musica.id}">Excluir</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
	</tbody>
</table>
<br />
<a href="/treinawebSpringMVC/musicas/adicionar" class="btn btn-default">Adicionar nova Musica</a>


