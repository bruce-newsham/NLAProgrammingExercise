  <#include "/layout/basePage.ftl" />

<@basePage title="Readers">
	<div id="content">
  		<div id="readers">
  			
		<#if model["readerList"]??>

			<table class="table table-hover table-bordered w-auto">
  				<thead class="thead-light">
  					<tr>
  					<th>Name</th>
  					<th>E-Mail</th>
  					<th>Telephone Number</th>
  					</tr>
  				</thead>
    			<#list model["readerList"] as reader>
	  				<tr>
	  				<td>${reader.firstName}&nbsp;${reader.lastName}</td>
	  				<td>${reader.email}</td>
	  				<td>${reader.phoneNumber}</td>
	  				<td>
	  					<button class="btn btn-primary" onclick="borrowedBooksByReader(${reader.id})">Borrowings</a>
	  				</td>
	  				</tr>
    			</#list>
  			</table>
  		</#if>
  		<div id="borrowings"></div>
  
  		<script type="text/javascript" src="/resources/js/borrowing.js"></script>
   		
   	</div>
</div>  
</@basePage>
