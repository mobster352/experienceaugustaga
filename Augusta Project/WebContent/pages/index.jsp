<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<html>

<head>

<title>Test - Homepage</title>

<%@ include file="commonHeaderStuff.jsp"%>

<script>
$(document).ready(function(){
  // Add smooth scrolling to all links in navbar + footer link
  $("#button").on('click', function(event) {
	  $.ajax({
		  url: "https://app.ticketmaster.com/discovery/v2/events.json?apikey=dcjK3TrLLkDkPzRE7MRO6FbeGPMV9yqR&size=1",
		  type: "GET"
		  
		}).done(function (msg){
			 //alert(JSON.stringify(msg));
			var context = '${pageContext.request.contextPath}/';

			$.ajax({
				url: context+"api",
				type: "POST",
				data: {
					text: JSON.stringify(msg)
				}
			});
		});
			 
  });
});
</script>

</head>

<body>
			
	<!-- content starts here -->
	
	<div class="jumbotron text-center">
		<div class="container">
			
			<p>Hello World</p>
			<%-- <c:out value="${salary}"/> --%>
			<button id="button">Click Me</button>
			
		</div>
	</div>			
	
	<!-- content ends here -->

</body>

</html>