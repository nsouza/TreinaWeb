<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<<<<<< HEAD
<%@ page buffer="8192kb" %>
<h2>Listagem de Albuns</h2>
<br />
<div class="row">
	<div class="col-md-6">
		<div class="form-group">
			<label>algum a ser perquisado</label>
			<input type="text" id="txt-pesquisa" class="form-control">
		</div>
		<button class="btn btn-defautl" id="btn-pesquisar">Pesquisar</button>
	</div>
</div>
<table class="table" id="tbl-albuns">
=======
<h2>Listagem de Albuns</h2>
<br />
<table class="table">
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
	<thead>
		<th>ID</th>
		<th>Nome do Album</th>
		<th>Ano do Lan�amento</th>
		<th>A��es</th>
	</thead>
	<tbody>
		<c:if test="${!empty albuns}">
			<c:forEach items="${albuns}" var="album">
				<tr>
					<td>${album.id}</td>
					<td>${album.nome}</td>
					<td>${album.anoDeLancamento}</td>
					<td>
<<<<<<< HEAD
						<a href="/treinawebSpringMVC/albuns/alterar/${album.id}">Alterar</a> | 
=======
						<a href="/treinawebSpringMVC/albuns/alterar/${album.id}">Alterar</a>|
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
						<a href="/treinawebSpringMVC/albuns/excluir/${album.id}">Excluir</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
	</tbody>
</table>
<br />
<a href="/treinawebSpringMVC/albuns/adicionar" class="btn btn-default">Adicionar novo Album</a>



<<<<<<< HEAD
<script type="text/javascript">
$(document).ready(function(){
	$('#btn-pesquisar').click(function(){
		var nomeAlbum = $('#txt-pesquisa').val();
		$.ajax({
			method: 'GET',
			url: '/treinawebSpringMVC/albuns/porNome/' + nomeAlbum,
			success: function(data){
				$('#tbl-albuns tbody > tr').remove();
				$('tbl-albuns tbody').append(
					'<tr>' +
					'<td>' + data.id + '<td>' +
					'<td>' + data.nome + '<td>' +
					'<td>' + data.anoDeLancamento + '<td>' +
					'<td>'+
					'	<a href="/treinawebSpringMVC/albuns/alterar/' + data.id + '">Alterar</a> |' +	
					'	<a href="/treinawebSpringMVC/albuns/excluir/' + data.id + '">Excluir</a>' +
					'<td>' + 
					'</tr>'					
				);
			},
			error: function(){
				alert("Houve um erro na requisi��o.");
			}
		});
	});
});
</script>
=======
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
