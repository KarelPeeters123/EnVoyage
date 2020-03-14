<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page isELIgnored="false"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<c:set var = "requestlink" value = "${requestScope['javax.servlet.forward.request_uri']}"/>--%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<nav class="navbar navbar-default" style="background-color: #ffffe0">
	<div class="container-fluid">
		<ul class="nav navbar-nav">
			<li><a href="Controller?command=home">Home</a></li>
			<li><a href="Controller?command=information">Information</a></li>
			<li><a href="Controller?command=pictures">Pictures</a></li>
			<li><a href="Controller?command=contact">Contact</a></li>
			<li class="dropdown">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#">Language
					<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="Controller?command=changeLanguage&lang=en&origin=${origin}">en</a></li>
					<li><a href="Controller?command=changeLanguage&lang=de&origin=${origin}">de</a></li>
					<li><a href="Controller?command=changeLanguage&lang=fr&origin=${origin}">fr</a></li>
					<li><a href="Controller?command=changeLanguage&lang=nl&origin=${origin}">nl</a></li>
				</ul>
			</li>
		</ul>
	</div>
</nav>

