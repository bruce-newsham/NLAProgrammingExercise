<#include "/layout/basePage.ftl" />

<@basePage title="books">
<div id="content">
  
	<#if model["bookList"]??>
	<div id="books">
		<table class="table table-hover table-bordered w-auto">
  			<thead class="thead-light">
  				<tr>
  					<th colspan="3">Books</th>
  				</tr>
  				<tr>
  					<th>ISBN</th>  <th>Title</th> <th>Author</th>
  				</tr>
  			</thead>
  		
    		<#list model["bookList"] as book>
	  			<tr>
	  				<td>${book.ISBN}</td> <td>${book.title}</td> <td>${book.author.firstName}&nbsp;${book.author.lastName}</td>
	  			</tr>
    		</#list>
		</table>
  
		<br />
	</div>
	</#if>
</div> 
</@basePage>