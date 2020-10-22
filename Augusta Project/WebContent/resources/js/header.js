/**
 * 
 */


$(document).ready(function() {
	
	if (document.cookie == "") {

		alert("Not Logged In")
		window.location.href = "http://localhost:8080/lncc/login.jsp"

	}

	var c = document.cookie;
	var theData = c;

	$
	.ajax({
		url : "http://localhost:8080/lncc/resources/getrank/",
		type : "POST",
		dataType : "text",
		contentType : "application/x-www-form-urlencoded",
		data : theData,

		success : function(result, status, jqxhr) {
			//alert("success: " + status);
			var rank = JSON.parse(result);
			//alert(userArray);
			if (rank == "Recruit") {
				$("#navbar").append('<li><a href = "recruit.jsp">Recruits</a></li>');
			}
		},
		error : function(xhr, status, errorThrown) {
			alert("error: " + status + " e: "
					+ errorThrown);
		}

	});
	
});