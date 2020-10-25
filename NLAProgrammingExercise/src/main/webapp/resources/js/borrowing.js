
function borrowedBooksByReader(readerId) {

	$('#borrowings').html("");
    var search = {}
    search["reader"] = readerId;

    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/borrowedBooksByReader",
        data: JSON.stringify(search),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
        	
        	if(data.msg!=='success'){
        		alert(data.msg);
        	}else{
        		
            var json="<div id=\"books\">";
            json+="<table class=\"table table-hover table-bordered w-auto\">";
            json+="	<thead class=\"thead-light\">";
            json+="		<tr>";
            json+="			<th colspan=\"5\">Books borrowed by "+data.result[0].reader.firstName +" "+data.result[0].reader.lastName+"</th>";
      		json+="		</tr>";
      		json+="		<tr>";
      		json+="				<th>ISBN</th>  <th>Title</th> <th>Author</th> <th>Out Date</th> <th>Return Date</th>";
      		json+="			</tr>";
      		json+="		</thead>";
    	  	
      
    	  	jQuery.each(data.result, function(index, item) {
    	  		json+="<tr>";
    	  		var bookLine="<td>"+item.book.isbn+"</td> <td>"+item.book.title+"</td>"
    	  		bookLine+="<td>"+item.book.author.firstName+" "+item.book.author.lastName+"</td>";
    	  		var retDate
    	  		if (item.returnedDate != null) {
    	  			retDate = item.returnedDate
    	  		}else{
    	  			retDate = "Not Returned"
    	  		}
    	  		bookLine+="<td>"+item.borrowedDate+"</td> <td>"+retDate+"</td>";
    	  		json+=bookLine;
    	  		json+="</tr>";
    	  	});
    	  	json+="	</table>";
    	  	json+="	<br />";
    	  	json+="	</div>";
                 
            $('#borrowings').html(json);
               
            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);
        	}
        },
        error: function (e) {
        	alert(e.responseText);
            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}

